package com.lugew.objectstorage.core;


import com.lugew.objectstorage.core.exception.CantPutObjectException;
import com.lugew.objectstorage.core.exception.ClientNotInitializedException;
import software.amazon.awssdk.core.ResponseInputStream;
import software.amazon.awssdk.core.sync.RequestBody;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.*;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author 夏露桂
 * @since 2021/1/29 18:16
 */
public abstract class AbstractObjectStorage implements ObjectStorage {
    protected final String uri;
    protected final String id;
    protected final String key;
    protected final String bucket;
    protected final String region;
    protected Type type;
    protected S3Client client;

    public AbstractObjectStorage(String uri, String id, String key, String bucket, String region, S3Client client) {
        this.uri = uri;
        this.id = id;
        this.key = key;
        this.bucket = bucket;
        this.region = region;
        this.type = Type.UNKNOWN;
        this.client = client;
    }

    @Override
    public PutObjectResponse putObject(String key, File file) {
        return getClient().putObject(
                PutObjectRequest.builder()
                        .bucket(getBucket())
                        .key(key)
                        .build(),
                RequestBody.fromFile(file)
        );
    }

    @Override
    public PutObjectResponse putObject(String key, InputStream input) {
        try {
            return getClient().putObject(
                    PutObjectRequest.builder()
                            .bucket(getBucket())
                            .key(key)
                            .build(),
                    RequestBody.fromInputStream(input, input.available())
            );
        } catch (IOException e) {
            throw new CantPutObjectException(e);
        }
    }

    @Override
    public CreateBucketResponse createBucket(String name) {
        return getClient().createBucket(
                CreateBucketRequest.builder()
                        .bucket(name)
                        .build()
        );
    }

    @Override
    public DeleteBucketResponse deleteBucket(String name) {
        return getClient().deleteBucket(
                DeleteBucketRequest.builder()
                        .bucket(name)
                        .build()
        );
    }

    @Override
    public ResponseInputStream<GetObjectResponse> getObject(String key) {
        return getClient().getObject(
                GetObjectRequest.builder()
                        .bucket(getBucket())
                        .key(key)
                        .build()
        );
    }

    @Override
    public DeleteObjectResponse deleteObject(String key) {
        return getClient().deleteObject(
                DeleteObjectRequest.builder()
                        .bucket(getBucket())
                        .key(key)
                        .build()
        );
    }

    @Override
    public S3Client getClient() {
        if (null == client) {
            throw new ClientNotInitializedException();
        }
        return client;
    }

    @Override
    public Type getType() {
        return this.type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getKey() {
        return key;
    }

    @Override
    public String getUri() {
        return uri;
    }

    @Override
    public String getRegion() {
        return region;
    }

    @Override
    public String getBucket() {
        return bucket;
    }
}
