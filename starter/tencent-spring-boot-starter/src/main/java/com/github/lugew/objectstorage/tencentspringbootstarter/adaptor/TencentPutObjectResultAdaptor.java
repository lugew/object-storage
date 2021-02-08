package com.github.lugew.objectstorage.tencentspringbootstarter.adaptor;

import com.github.lugew.objectstorage.core.adaptor.PutObjectResultAdaptor;
import com.qcloud.cos.model.Owner;
import com.qcloud.cos.model.PutObjectResult;

/**
 * @author 夏露桂
 * @since 2021/2/5 17:01
 */
public class TencentPutObjectResultAdaptor extends PutObjectResultAdaptor<PutObjectResult, Owner> {
    public TencentPutObjectResultAdaptor(PutObjectResult adaptee) {
        super(adaptee);
    }
}
