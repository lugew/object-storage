package com.lugew.objectstorage.core;


import java.util.Date;

/**
 * @author 夏露桂
 * @since 2021/2/5 16:04
 */
public interface ObjectSummary<A, O> extends Adaptor<A> {

    String getBucketName();

    void setBucketName(String bucketName);

    String getKey();


    void setKey(String key);


    String getETag();


    void setETag(String eTag);


    long getSize();

    void setSize(long size);

    Date getLastModified();


    void setLastModified(Date lastModified);

    Owner<O> getOwner();

    void setOwner(Owner<O> owner);

    String getStorageClass();

    void setStorageClass(String storageClass);

}
