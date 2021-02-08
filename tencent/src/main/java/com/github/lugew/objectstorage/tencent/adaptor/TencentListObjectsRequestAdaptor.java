package com.github.lugew.objectstorage.tencent.adaptor;

import com.github.lugew.objectstorage.core.adaptor.ListObjectsRequestAdaptor;
import com.qcloud.cos.model.ListObjectsRequest;

/**
 * @author 夏露桂
 * @since 2021/2/5 16:32
 */
public class TencentListObjectsRequestAdaptor extends ListObjectsRequestAdaptor<ListObjectsRequest> {

    public TencentListObjectsRequestAdaptor(ListObjectsRequest adaptee) {
        super(adaptee);
    }
}
