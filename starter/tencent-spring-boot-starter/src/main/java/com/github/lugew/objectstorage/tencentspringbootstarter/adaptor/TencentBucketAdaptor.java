package com.github.lugew.objectstorage.tencentspringbootstarter.adaptor;

import com.github.lugew.objectstorage.core.adaptor.BucketAdaptor;
import com.qcloud.cos.model.Bucket;

/**
 * @author 夏露桂
 * @since 2021/2/5 15:34
 */
public class TencentBucketAdaptor extends BucketAdaptor<Bucket, com.qcloud.cos.model.Owner> {

    public TencentBucketAdaptor(Bucket adaptee) {
        super(adaptee);
    }
}
