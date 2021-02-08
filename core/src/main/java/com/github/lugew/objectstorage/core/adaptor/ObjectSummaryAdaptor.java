package com.github.lugew.objectstorage.core.adaptor;

import com.github.lugew.objectstorage.core.ObjectSummary;
import com.github.lugew.objectstorage.core.Owner;

import java.util.Date;

/**
 * @author 夏露桂
 * @since 2021/2/7 15:15
 */
public class ObjectSummaryAdaptor<A, O> extends AbstractAdaptor<A> implements ObjectSummary<A, O> {
    public ObjectSummaryAdaptor(A adaptee) {
        super(adaptee);
    }

    @Override
    public String getBucketName() {
        return (String) invoke();
    }

    @Override
    public void setBucketName(String bucketName) {
        invoke(bucketName);
    }

    @Override
    public String getKey() {
        return (String) invoke();
    }

    @Override
    public void setKey(String key) {
        invoke(key);
    }

    @Override
    public String getETag() {
        return (String) invoke();
    }

    @Override
    public void setETag(String eTag) {
        invoke(eTag);
    }

    @Override
    public long getSize() {
        return (long) invoke();
    }

    @Override
    public void setSize(long size) {
        invoke(size);
    }

    @Override
    public Date getLastModified() {
        return (Date) invoke();
    }

    @Override
    public void setLastModified(Date lastModified) {
        invoke(lastModified);
    }

    @Override
    public Owner<O> getOwner() {
        return new OwnerAdaptor<>((O) invoke());
    }

    @Override
    public void setOwner(Owner<O> owner) {
        invoke(owner);
    }

    @Override
    public String getStorageClass() {
        return (String) invoke();
    }

    @Override
    public void setStorageClass(String storageClass) {
        invoke(storageClass);
    }
}
