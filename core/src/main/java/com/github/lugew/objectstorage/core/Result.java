package com.github.lugew.objectstorage.core;


import java.util.Date;

/**
 * @author 夏露桂
 * @since 2021/2/8 11:13
 */
public interface Result<OM> {
    String getRequestId();

    void setRequestId(String requestId);

    String getDateStr();

    void setDateStr(String dateStr);

    String getVersionId();

    void setVersionId(String versionId);

    String getETag();

    void setETag(String eTag);

    Date getExpirationTime();

    void setExpirationTime(Date expirationTime);

    String getExpirationTimeRuleId();

    void setExpirationTimeRuleId(String expirationTimeRuleId);

    void setContentMd5(String contentMd5);

    String getContentMd5();

    ObjectMetadata<OM> getMetadata();

    void setMetadata(ObjectMetadata<OM> metadata);

    String getCrc64Ecma();

    void setCrc64Ecma(String crc64Ecma);
}
