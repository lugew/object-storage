package com.github.lugew.objectstorage.core;

import com.github.lugew.objectstorage.core.adaptor.AbstractAdaptor;

/**
 * @author 夏露桂
 * @since 2021/2/8 11:05
 */
public abstract class AbstractRequestAdaptor<A> extends AbstractAdaptor<A> implements Request<A> {

    public AbstractRequestAdaptor(A adaptee) {
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
