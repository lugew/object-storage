package com.lugew.objectstorage.core;

/**
 * @author 夏露桂
 * @since 2021/2/5 16:27
 */
public interface ListObjectsRequest<L> extends Adaptor<L> {

    String getBucketName();

    void setBucketName(String bucketName);

    String getPrefix();

    void setPrefix(String prefix);


    String getMarker();

    void setMarker(String marker);


    String getDelimiter();

    void setDelimiter(String delimiter);


    Integer getMaxKeys();

    void setMaxKeys(Integer maxKeys);


    String getEncodingType();

    void setEncodingType(String encodingType);


}
