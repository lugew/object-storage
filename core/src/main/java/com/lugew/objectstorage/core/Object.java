package com.lugew.objectstorage.core;

import java.io.InputStream;


/**
 * @author 夏露桂
 * @since 2021/2/4 16:49
 */
public interface Object<A, OM, OIS> extends Adaptor<A> {
    ObjectMetadata<OM> getObjectMetadata();

    void setObjectMetadata(ObjectMetadata<OM> metadata);

    ObjectInputStream<OIS> getObjectContent();

    void setObjectContent(ObjectInputStream<OIS> objectContent);

    void setObjectContent(InputStream objectContent);

    String getBucketName();

    void setBucketName(String bucketName);

    void setKey(String key);

    String toString();

    void close();
}
