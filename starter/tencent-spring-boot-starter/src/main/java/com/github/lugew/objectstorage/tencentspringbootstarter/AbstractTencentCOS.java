package com.github.lugew.objectstorage.tencentspringbootstarter;


import com.github.lugew.objectstorage.core.AbstractObjectStorage;
import com.github.lugew.objectstorage.core.Type;
import com.github.lugew.objectstorage.tencentspringbootstarter.adaptor.TencentBucketAdaptor;
import com.github.lugew.objectstorage.tencentspringbootstarter.adaptor.TencentObjectListingAdaptor;
import com.qcloud.cos.COSClient;
import com.qcloud.cos.ClientConfig;
import com.qcloud.cos.auth.BasicCOSCredentials;
import com.qcloud.cos.auth.COSCredentials;
import com.qcloud.cos.exception.MultiObjectDeleteException;
import com.qcloud.cos.model.*;
import com.qcloud.cos.region.Region;
import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
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
            String secretId,
            String secretKey,
            String bucketName,
            String region
    ) {
        super(urlPrefix, secretId, secretKey, bucketName, region);
        this.setType(Type.TENCENT);
        COSCredentials credentials = new BasicCOSCredentials(getId(), getKey());
        ClientConfig config = new ClientConfig(new Region(getRegion()));
        client = new COSClient(credentials, config);
    }

    @Override
    public List<com.github.lugew.objectstorage.core.Bucket> listBuckets() {
        return client.listBuckets().stream().map(TencentBucketAdaptor::new).collect(Collectors.toList());
    }

    @Override
    public com.github.lugew.objectstorage.core.Bucket createBucket(String bucketName) {
        return new TencentBucketAdaptor(client.createBucket(bucketName));
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
    public com.github.lugew.objectstorage.core.ObjectListing listObjects(com.github.lugew.objectstorage.core.ListObjectsRequest<ListObjectsRequest> listObjectsRequest) {
        return new TencentObjectListingAdaptor(client.listObjects(listObjectsRequest.get()));
    }
}
