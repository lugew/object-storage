package com.github.lugew.objectstorage.tencentspringbootstarter.adaptor;

import com.github.lugew.objectstorage.core.adaptor.GetObjectRequestAdaptor;
import com.qcloud.cos.model.GetObjectRequest;

/**
 * @author 夏露桂
 * @since 2021/2/8 11:56
 */
public class TencentGetObjectRequestAdaptor extends GetObjectRequestAdaptor<GetObjectRequest> {
    public TencentGetObjectRequestAdaptor(GetObjectRequest adaptee) {
        super(adaptee);
    }
}
