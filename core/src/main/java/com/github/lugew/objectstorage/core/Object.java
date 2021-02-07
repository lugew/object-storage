package com.github.lugew.objectstorage.core;

import java.io.InputStream;


/**
 * @author 夏露桂
 * @since 2021/2/4 16:49
 */
public interface Object {
    ObjectMetadata getObjectMetadata();

    void setObjectMetadata(ObjectMetadata metadata);

    ObjectInputStream getObjectContent();

    void setObjectContent(ObjectInputStream objectContent);

    void setObjectContent(InputStream objectContent);

    String getBucketName();

    void setBucketName(String bucketName);

    void setKey(String key);

    String toString();

    void close();
}
