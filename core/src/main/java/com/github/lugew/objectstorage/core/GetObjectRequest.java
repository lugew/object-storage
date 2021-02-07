package com.github.lugew.objectstorage.core;

/**
 * @author 夏露桂
 * @since 2021/2/7 17:02
 */
public interface GetObjectRequest {

    String getBucketName();

    void setBucketName(String bucketName);

    String getKey();

    void setKey(String key);

}
