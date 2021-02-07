package com.github.lugew.objectstorage.tencentspringbootstarter.adaptor;

import com.github.lugew.objectstorage.core.PutObjectResult;
import com.github.lugew.objectstorage.core.adaptor.PutObjectResultAdaptor;

/**
 * @author 夏露桂
 * @since 2021/2/5 17:01
 */
public class TencentPutObjectResultAdaptor extends PutObjectResultAdaptor<PutObjectResult> {
    public TencentPutObjectResultAdaptor(PutObjectResult putObjectResult) {
        super(putObjectResult);
    }
}
