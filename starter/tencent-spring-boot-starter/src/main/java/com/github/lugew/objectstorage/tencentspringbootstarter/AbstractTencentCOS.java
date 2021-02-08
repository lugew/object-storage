package com.github.lugew.objectstorage.tencentspringbootstarter;


import com.github.lugew.objectstorage.core.*;
import com.github.lugew.objectstorage.core.adaptor.ObjectAdaptor;
import com.github.lugew.objectstorage.core.adaptor.PutObjectResultAdaptor;
import com.github.lugew.objectstorage.tencentspringbootstarter.adaptor.*;
import com.qcloud.cos.COSClient;
import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 腾讯对象存储
 *
 * @author LuGew
 * @since 2020/10/22
 */
@Slf4j
public abstract class AbstractTencentCOS extends AbstractObjectStorage {
    protected final COSClient client;

    public AbstractTencentCOS(
            String urlPrefix,
            String id,
            String key,
            String bucketName,
            String region,
            COSClient client
    ) {
        super(urlPrefix, id, key, bucketName, region);
        this.setType(Type.TENCENT);
        this.client = client;
    }

    @Override
    public List<Bucket<?, ?>> listBuckets() {
        return client.listBuckets().stream().map(TencentBucketAdaptor::new).collect(Collectors.toList());
    }

    @Override
    public boolean doesBucketExist(String bucketName) {
        return client.doesBucketExist(bucketName);
    }

    @Override
    public void deleteBucket(String bucketName) {
        client.deleteBucket(bucketName);
    }

    @Override
    public Bucket<?, ?> createBucket(String bucketName) {
        return new TencentBucketAdaptor(client.createBucket(bucketName));
    }

    @Override
    public ObjectListing<?, ?, ?> listObjects(ListObjectsRequest<?> listObjectsRequest) {
        return new TencentObjectListingAdaptor(client.listObjects((com.qcloud.cos.model.ListObjectsRequest) listObjectsRequest.adaptee()));
    }

    @Override
    public PutObjectResult<?, ?> putObject(String bucketName, String key, File file) {
        return new TencentPutObjectResultAdaptor(client.putObject(bucketName, key, file));
    }

    @Override
    public PutObjectResult<?, ?> putObject(String bucketName, String key, InputStream input, ObjectMetadata<?> metadata) {
        return new TencentPutObjectResultAdaptor(client.putObject(bucketName, key, input, (com.qcloud.cos.model.ObjectMetadata) metadata.adaptee()));
    }

    @Override
    public PutObjectResult<?, ?> putObject(PutObjectRequest<?> request) {
        return new PutObjectResultAdaptor<>(client.putObject((com.qcloud.cos.model.PutObjectRequest) request));
    }

    @Override
    public ObjectMetadata<?> getObjectMetadata(String bucketName, String key) {
        return new TencentObjectMetadataAdaptor(client.getObjectMetadata(bucketName, key));
    }

    @Override
    public ObjectAdaptor<?, ?, ?> getObject(GetObjectRequest<?> getObjectRequest) {
        return new TencentObjectAdaptor(client.getObject((com.qcloud.cos.model.GetObjectRequest) getObjectRequest.adaptee()));
    }

    @Override
    public ObjectMetadata<?> getObject(GetObjectRequest<?> getObjectRequest, File destinationFile) {
        return new TencentObjectMetadataAdaptor(client.getObject((com.qcloud.cos.model.GetObjectRequest) getObjectRequest.adaptee(), destinationFile));
    }
}
