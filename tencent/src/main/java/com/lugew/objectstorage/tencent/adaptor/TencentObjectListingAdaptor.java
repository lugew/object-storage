package com.lugew.objectstorage.tencent.adaptor;

import com.lugew.objectstorage.core.adaptor.ObjectListingAdaptor;
import com.qcloud.cos.model.COSObjectSummary;
import com.qcloud.cos.model.ObjectListing;
import com.qcloud.cos.model.Owner;

/**
 * @author 夏露桂
 * @since 2021/2/5 16:16
 */
public class TencentObjectListingAdaptor extends ObjectListingAdaptor<ObjectListing, COSObjectSummary, Owner> {
    public TencentObjectListingAdaptor(ObjectListing objectListing) {
        super(objectListing);
    }
}
