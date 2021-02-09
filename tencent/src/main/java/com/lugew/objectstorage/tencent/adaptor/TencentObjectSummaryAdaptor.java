package com.lugew.objectstorage.tencent.adaptor;

import com.lugew.objectstorage.core.adaptor.ObjectSummaryAdaptor;
import com.qcloud.cos.model.COSObjectSummary;
import com.qcloud.cos.model.Owner;

/**
 * @author 夏露桂
 * @since 2021/2/5 16:07
 */
public class TencentObjectSummaryAdaptor extends ObjectSummaryAdaptor<COSObjectSummary, Owner> {
    public TencentObjectSummaryAdaptor(COSObjectSummary adaptee) {
        super(adaptee);
    }
}
