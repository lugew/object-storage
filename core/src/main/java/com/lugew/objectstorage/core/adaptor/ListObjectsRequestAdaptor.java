package com.lugew.objectstorage.core.adaptor;

import com.lugew.objectstorage.core.ListObjectsRequest;

/**
 * @author 夏露桂
 * @since 2021/2/5 16:27
 */
public class ListObjectsRequestAdaptor<A> extends AbstractAdaptor<A> implements ListObjectsRequest<A> {


    public ListObjectsRequestAdaptor(A adaptee) {
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
    public String getPrefix() {
        return (String) invoke();
    }

    @Override
    public void setPrefix(String prefix) {
        invoke(prefix);
    }

    @Override
    public String getMarker() {
        return (String) invoke();
    }

    @Override
    public void setMarker(String marker) {
        invoke(marker);
    }

    @Override
    public String getDelimiter() {
        return (String) invoke();
    }

    @Override
    public void setDelimiter(String delimiter) {
        invoke(delimiter);
    }

    @Override
    public Integer getMaxKeys() {
        return (Integer) invoke();
    }

    @Override
    public void setMaxKeys(Integer maxKeys) {
        invoke(maxKeys);
    }

    @Override
    public String getEncodingType() {
        return (String) invoke();
    }

    @Override
    public void setEncodingType(String encodingType) {
        invoke(encodingType);
    }
}
