package com.github.lugew.objectstorage.tencentspringbootstarter.adaptor;

import com.github.lugew.objectstorage.core.adaptor.GetObjectResultAdaptor;
import com.qcloud.cos.model.GetObjectRequest;
import com.qcloud.cos.model.Owner;

/**
 * @author 夏露桂
 * @since 2021/2/8 11:56
 */
public class TencentGetObjectResultAdaptor extends GetObjectResultAdaptor<GetObjectRequest, Owner> {
    public TencentGetObjectResultAdaptor(GetObjectRequest adaptee) {
        super(adaptee);
    }
}
