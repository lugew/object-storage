package com.lugew.objectstorage.core.adaptor;

import com.lugew.objectstorage.core.GetObjectRequest;

/**
 * @author 夏露桂
 * @since 2021/2/7 17:05
 */
public class GetObjectRequestAdaptor<A> extends AbstractAdaptor<A> implements GetObjectRequest<A> {

    public GetObjectRequestAdaptor(A adaptee) {
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
}
