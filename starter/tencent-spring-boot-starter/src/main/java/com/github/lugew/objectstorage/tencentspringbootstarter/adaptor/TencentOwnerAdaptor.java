package com.github.lugew.objectstorage.tencentspringbootstarter.adaptor;

import com.github.lugew.objectstorage.core.adaptor.OwnerAdaptor;
import com.qcloud.cos.model.Owner;

/**
 * 腾讯云Owner适配器
 *
 * @author 夏露桂
 * @since 2021/2/5 15:19
 */
public class TencentOwnerAdaptor extends OwnerAdaptor<Owner> {
    public TencentOwnerAdaptor(Owner adaptee) {
        super(adaptee);
    }
}
