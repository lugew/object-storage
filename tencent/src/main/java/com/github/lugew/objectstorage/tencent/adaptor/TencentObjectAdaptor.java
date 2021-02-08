package com.github.lugew.objectstorage.tencent.adaptor;

import com.github.lugew.objectstorage.core.adaptor.ObjectAdaptor;
import com.qcloud.cos.model.COSObject;
import com.qcloud.cos.model.COSObjectInputStream;
import com.qcloud.cos.model.ObjectMetadata;

/**
 * @author 夏露桂
 * @since 2021/2/8 11:59
 */
public class TencentObjectAdaptor extends ObjectAdaptor<COSObject, ObjectMetadata, COSObjectInputStream> {
    public TencentObjectAdaptor(COSObject adaptee) {
        super(adaptee);
    }
}
