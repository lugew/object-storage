package com.github.lugew.objectstorage.tencentspringbootstarter.adaptor;

import com.github.lugew.objectstorage.core.adaptor.ListObjectsRequestAdaptor;
import com.qcloud.cos.model.ListObjectsRequest;

/**
 * @author 夏露桂
 * @since 2021/2/5 16:32
 */
public class TencentListObjectsRequestAdaptor extends ListObjectsRequestAdaptor<com.qcloud.cos.model.ListObjectsRequest> {

    public TencentListObjectsRequestAdaptor(ListObjectsRequest adaptee) {
        super(adaptee);
    }
}
