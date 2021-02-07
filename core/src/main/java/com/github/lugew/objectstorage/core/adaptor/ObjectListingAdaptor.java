package com.github.lugew.objectstorage.core.adaptor;

import com.github.lugew.objectstorage.core.ObjectListing;
import com.github.lugew.objectstorage.core.ObjectSummary;

import java.util.List;

/**
 * @author 夏露桂
 * @since 2021/2/7 15:07
 */
public class ObjectListingAdaptor<A, O> extends AbstractAdaptor<A> implements ObjectListing<O> {
    public ObjectListingAdaptor(A adaptee) {
        super(adaptee);
    }

    @Override
    public List<ObjectSummary<O>> getObjectSummaries() {
        return (List<ObjectSummary<O>>) invoke();
    }

    @Override
    public List<String> getCommonPrefixes() {
        return (List<String>) invoke();
    }

    @Override
    public void setCommonPrefixes(List<String> commonPrefixes) {
        invoke(commonPrefixes);
    }

    @Override
    public String getNextMarker() {
        return (String) invoke();
    }

    @Override
    public void setNextMarker(String nextMarker) {
        invoke(nextMarker);
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
    public int getMaxKeys() {
        return (int) invoke();
    }

    @Override
    public void setMaxKeys(int maxKeys) {
        invoke(maxKeys);
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
    public boolean isTruncated() {
        return (boolean) invoke();
    }

    @Override
    public void setTruncated(boolean isTruncated) {
        invoke(isTruncated);
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
