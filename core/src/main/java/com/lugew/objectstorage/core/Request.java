package com.lugew.objectstorage.core;

/**
 * @author 夏露桂
 * @since 2021/2/8 11:02
 */
public interface Request<R> {
    String getBucketName();

    void setBucketName(String bucketName);

    String getKey();

    void setKey(String key);
}
