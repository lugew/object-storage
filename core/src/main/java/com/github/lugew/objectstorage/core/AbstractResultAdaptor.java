package com.github.lugew.objectstorage.core;

import com.github.lugew.objectstorage.core.adaptor.AbstractAdaptor;

import java.util.Date;

/**
 * @author 夏露桂
 * @since 2021/2/8 11:05
 */
public abstract class AbstractResultAdaptor<A, OM> extends AbstractAdaptor<A> implements Result<OM> {


    public AbstractResultAdaptor(A adaptee) {
        super(adaptee);
    }

    @Override
    public String getRequestId() {
        return (String) invoke();
    }

    @Override
    public void setRequestId(String requestId) {
        invoke(requestId);
    }

    @Override
    public String getDateStr() {
        return (String) invoke();
    }

    @Override
    public void setDateStr(String dateStr) {
        invoke(dateStr);
    }

    @Override
    public String getVersionId() {
        return (String) invoke();
    }

    @Override
    public void setVersionId(String versionId) {
        invoke(versionId);
    }

    @Override
    public String getETag() {
        return (String) invoke();
    }

    @Override
    public void setETag(String eTag) {
        invoke(eTag);
    }

    @Override
    public Date getExpirationTime() {
        return (Date) invoke();
    }

    @Override
    public void setExpirationTime(Date expirationTime) {
        invoke(expirationTime);
    }

    @Override
    public String getExpirationTimeRuleId() {
        return (String) invoke();
    }

    @Override
    public void setExpirationTimeRuleId(String expirationTimeRuleId) {
        invoke(expirationTimeRuleId);
    }

    @Override
    public void setContentMd5(String contentMd5) {
        invoke(contentMd5);
    }

    @Override
    public String getContentMd5() {
        return (String) invoke();
    }

    @Override
    public ObjectMetadata<OM> getMetadata() {
        return (ObjectMetadata<OM>) invoke();
    }

    @Override
    public void setMetadata(ObjectMetadata<OM> metadata) {
        invoke(metadata);
    }

    @Override
    public String getCrc64Ecma() {
        return (String) invoke();
    }

    @Override
    public void setCrc64Ecma(String crc64Ecma) {
        invoke(crc64Ecma);
    }
}
