package com.github.lugew.objectstorage.core.adaptor;

import com.github.lugew.objectstorage.core.Object;
import com.github.lugew.objectstorage.core.ObjectInputStream;
import com.github.lugew.objectstorage.core.ObjectMetadata;

import java.io.InputStream;

/**
 * @author 夏露桂
 * @since 2021/2/7 16:55
 */
public class ObjectAdaptor<A> extends AbstractAdaptor<A> implements Object {
    public ObjectAdaptor(A adaptee) {
        super(adaptee);
    }

    @Override
    public ObjectMetadata getObjectMetadata() {
        return (ObjectMetadata) invoke();
    }

    @Override
    public void setObjectMetadata(ObjectMetadata metadata) {
        invoke(metadata);
    }

    @Override
    public ObjectInputStream getObjectContent() {
        return (ObjectInputStream) invoke();
    }

    @Override
    public void setObjectContent(ObjectInputStream objectContent) {
        invoke(objectContent);
    }

    @Override
    public void setObjectContent(InputStream objectContent) {
        invoke(objectContent);
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
    public void setKey(String key) {
        invoke(key);
    }

    @Override
    public void close() {
        invoke();
    }
}
