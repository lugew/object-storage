package com.lugew.objectstorage.aliyunspringbootstarter;

import com.lugew.objectstorage.aliyun.AliyunObjectStorage;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.S3Client;

import java.net.URI;

@Configuration
@EnableConfigurationProperties(Properties.class)
@RequiredArgsConstructor
@Slf4j
@ConditionalOnProperty(prefix = "object-storage.aliyun", name = "enabled", havingValue = "true")
public class AutoConfiguration {
    private final Properties properties;

    @Bean
    public AliyunObjectStorage aliyunObjectStorage() {
        String uri = properties.getUri();
        String id = properties.getId();
        String key = properties.getKey();
        String bucketName = properties.getBucketName();
        String region = properties.getRegion();

        return new AliyunObjectStorage(
                uri,
                id,
                key,
                bucketName,
                region,
                S3Client.builder()
                        .endpointOverride(URI.create(uri))
                        .credentialsProvider(StaticCredentialsProvider.create(AwsBasicCredentials.create(id, key)))
                        .region(Region.of(region))
                        .build()
        );
    }
}
