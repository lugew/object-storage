package com.github.lugew.objectstorage.tencentspringbootstarter;

import com.github.lugew.objectstorage.tencent.SimpleTencentObjectStorage;
import com.qcloud.cos.COSClient;
import com.qcloud.cos.ClientConfig;
import com.qcloud.cos.auth.BasicCOSCredentials;
import com.qcloud.cos.auth.COSCredentials;
import com.qcloud.cos.region.Region;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(Properties.class)
@RequiredArgsConstructor
@Slf4j
@ConditionalOnProperty(prefix = "object-storage.tencent", name = "enabled", havingValue = "true")
public class AutoConfiguration {
    private final Properties properties;

    @Bean
    public SimpleTencentObjectStorage simpleTencentObjectStorage() {
        String url = properties.getUrl();
        String id = properties.getId();
        String key = properties.getKey();
        String bucketName = properties.getBucketName();
        String region = properties.getRegion();
        COSCredentials credentials = new BasicCOSCredentials(id, key);
        ClientConfig config = new ClientConfig(new Region(region));
        COSClient client = new COSClient(credentials, config);
        return new SimpleTencentObjectStorage(
                url,
                id,
                key,
                bucketName,
                region,
                client
        );
    }
}
