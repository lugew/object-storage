package com.github.lugew.objectstorage.core;


import java.io.Serializable;
import java.util.List;

/**
 * @author 夏露桂
 * @since 2021/2/5 15:59
 */
public interface ObjectListing extends Serializable {

    List<ObjectSummary> getObjectSummaries();

    List<String> getCommonPrefixes();

    void setCommonPrefixes(List<String> commonPrefixes);

    String getNextMarker();

    void setNextMarker(String nextMarker);

    String getBucketName();

    void setBucketName(String bucketName);

    String getPrefix();

    void setPrefix(String prefix);

    String getMarker();


    void setMarker(String marker);

    int getMaxKeys();

    void setMaxKeys(int maxKeys);

    String getDelimiter();

    void setDelimiter(String delimiter);

    boolean isTruncated();

    void setTruncated(boolean isTruncated);

    String getEncodingType();

    void setEncodingType(String encodingType);

}
