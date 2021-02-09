package com.lugew.objectstorage.tencent.adaptor;


import com.lugew.objectstorage.core.adaptor.ObjectMetadataAdaptor;
import com.qcloud.cos.model.ObjectMetadata;

/**
 * @author 夏露桂
 * @since 2021/2/5 17:31
 */
public class TencentObjectMetadataAdaptor extends ObjectMetadataAdaptor<ObjectMetadata> {

    public TencentObjectMetadataAdaptor(ObjectMetadata adaptee) {
        super(adaptee);
    }
}