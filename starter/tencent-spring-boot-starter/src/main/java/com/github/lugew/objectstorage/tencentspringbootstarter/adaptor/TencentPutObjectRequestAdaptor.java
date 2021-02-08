package com.github.lugew.objectstorage.tencentspringbootstarter.adaptor;

import com.github.lugew.objectstorage.core.adaptor.PutObjectRequestAdaptor;
import com.qcloud.cos.model.PutObjectResult;

/**
 * @author 夏露桂
 * @since 2021/2/5 17:01
 */
public class TencentPutObjectRequestAdaptor extends PutObjectRequestAdaptor<PutObjectResult> {
    public TencentPutObjectRequestAdaptor(PutObjectResult adaptee) {
        super(adaptee);
    }
}
