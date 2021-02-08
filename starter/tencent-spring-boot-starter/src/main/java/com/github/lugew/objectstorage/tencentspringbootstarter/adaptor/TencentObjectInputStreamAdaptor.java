package com.github.lugew.objectstorage.tencentspringbootstarter.adaptor;

import com.github.lugew.objectstorage.core.adaptor.ObjectInputStreamAdaptor;
import com.qcloud.cos.model.COSObjectInputStream;

/**
 * @author 夏露桂
 * @since 2021/2/8 12:00
 */
public class TencentObjectInputStreamAdaptor extends ObjectInputStreamAdaptor<COSObjectInputStream> {
    public TencentObjectInputStreamAdaptor(COSObjectInputStream adaptee) {
        super(adaptee);
    }
}
