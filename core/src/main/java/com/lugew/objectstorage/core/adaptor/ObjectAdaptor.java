package com.lugew.objectstorage.core.adaptor;

import com.lugew.objectstorage.core.Object;
import com.lugew.objectstorage.core.ObjectInputStream;
import com.lugew.objectstorage.core.ObjectMetadata;

import java.io.InputStream;

/**
 * @author 夏露桂
 * @since 2021/2/7 16:55
 */
public class ObjectAdaptor<A, OM, OIS> extends AbstractAdaptor<A> implements Object<A, OM, OIS> {
    public ObjectAdaptor(A adaptee) {
        super(adaptee);
    }

    @Override
    public ObjectMetadata<OM> getObjectMetadata() {
        return new ObjectMetadataAdaptor<>((OM) invoke());
    }

    @Override
    public void setObjectMetadata(ObjectMetadata<OM> metadata) {
        invoke(metadata);
    }

    @Override
    public ObjectInputStream<OIS> getObjectContent() {
        return new ObjectInputStreamAdaptor<>((OIS) invoke());
    }

    @Override
    public void setObjectContent(ObjectInputStream<OIS> objectContent) {
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
