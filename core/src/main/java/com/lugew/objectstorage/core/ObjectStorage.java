package com.lugew.objectstorage.core;


import software.amazon.awssdk.core.ResponseInputStream;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.*;

import java.io.File;
import java.io.InputStream;

/**
 * 对象存储器接口，
 * 包含常用增删改
 *
 * @author 夏露桂
 * @since 2021/1/29 18:16
 */
public interface ObjectStorage {

    CreateBucketResponse createBucket(String name);

    DeleteBucketResponse deleteBucket(String name);

    PutObjectResponse putObject(String key, File file);

    PutObjectResponse putObject(String key, InputStream input);

    ResponseInputStream<GetObjectResponse> getObject(String key);

    DeleteObjectResponse deleteObject(String key);

    S3Client getClient();

    String getUri();

    String getId();

    String getKey();

    String getBucket();

    String getRegion();

    Type getType();

}
