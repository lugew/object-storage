package com.lugew.objectstorage.tencent;


import com.lugew.objectstorage.core.AbstractObjectStorage;
import com.lugew.objectstorage.core.Type;
import lombok.extern.slf4j.Slf4j;
import software.amazon.awssdk.services.s3.S3Client;

/**
 * 腾讯对象存储
 *
 * @author LuGew
 * @since 2020/10/22
 */
@Slf4j
public abstract class AbstractTencentObjectStorage extends AbstractObjectStorage {

    public AbstractTencentObjectStorage(
            String uri,
            String id,
            String key,
            String bucketName,
            String region,
            S3Client client
    ) {
        super(uri, id, key, bucketName, region, client);
        this.setType(Type.TENCENT);
    }
}
