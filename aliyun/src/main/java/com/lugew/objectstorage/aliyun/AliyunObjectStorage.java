package com.lugew.objectstorage.aliyun;


import lombok.extern.slf4j.Slf4j;
import software.amazon.awssdk.services.s3.S3Client;

/**
 * 阿里云对象存储
 *
 * @author LuGew
 * @since 2020/10/22
 */
@Slf4j
public class AliyunObjectStorage extends AbstractAliyunObjectStorage {
    public AliyunObjectStorage(
            String url,
            String id,
            String key,
            String bucketName,
            String region,
            S3Client client
    ) {
        super(url, id, key, bucketName, region, client);
    }
}
