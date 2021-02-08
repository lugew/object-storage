package com.github.lugew.objectstorage.core;

import com.github.lugew.objectstorage.core.adaptor.ObjectAdaptor;

import java.io.File;
import java.io.InputStream;
import java.util.List;

/**
 * 对象存储器接口，
 * 包含常用增删改
 *
 * @author 夏露桂
 * @since 2021/1/29 18:16
 */
public interface ObjectStorage {
    /**
     * 获取所有桶
     *
     * @return 桶列表
     */
    List<Bucket<?, ?>> listBuckets();

    /**
     * 创建桶
     *
     * @param bucketName 桶名称
     * @return 桶对象
     */
    Bucket<?, ?> createBucket(String bucketName);

    /**
     * 判断桶是否存在
     *
     * @param bucketName 桶名称
     * @return true：存在，false：不存在
     */
    boolean doesBucketExist(String bucketName);

    /**
     * 删除桶
     *
     * @param bucketName 桶名称
     */
    void deleteBucket(String bucketName);


    ObjectListing<?, ?, ?> listObjects(ListObjectsRequest<?> listObjectsRequest);


    PutObjectResult<?, ?> putObject(String bucketName, String key, File file);

    PutObjectResult<?, ?> putObject(String bucketName, String key, InputStream input, ObjectMetadata<?> metadata);


    PutObjectResult<?, ?> putObject(PutObjectRequest<?> request);


    ObjectMetadata<?> getObjectMetadata(String bucketName, String key);

    ObjectAdaptor<?, ?, ?> getObject(GetObjectRequest<?> getObjectRequest);

    ObjectMetadata<?> getObject(GetObjectRequest<?> getObjectRequest, File destinationFile);

    String getUrl();

    String getId();

    String getKey();

    String getBucket();

    String getRegion();

    Type getType();

}
