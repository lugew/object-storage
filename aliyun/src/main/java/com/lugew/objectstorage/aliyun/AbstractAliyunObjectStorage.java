package com.lugew.objectstorage.aliyun;


import com.lugew.objectstorage.core.AbstractObjectStorage;
import com.lugew.objectstorage.core.Type;
import lombok.extern.slf4j.Slf4j;
import software.amazon.awssdk.services.s3.S3Client;

/**
 * 阿里云对象存储
 *
 * @author LuGew
 * @since 2020/10/22
 */
@Slf4j
public abstract class AbstractAliyunObjectStorage extends AbstractObjectStorage {

    public AbstractAliyunObjectStorage(
            String uri,
            String id,
            String key,
            String bucketName,
            String region,
            S3Client client
    ) {
        super(uri, id, key, bucketName, region, client);
        this.setType(Type.ALIYUN);
    }
}
