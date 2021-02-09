package com.lugew.objectstorage.core.adaptor;

import com.lugew.objectstorage.core.AbstractRequestAdaptor;

/**
 * @author 夏露桂
 * @since 2021/2/8 11:04
 */
public class PutObjectRequestAdaptor<A> extends AbstractRequestAdaptor<A> {

    public PutObjectRequestAdaptor(A adaptee) {
        super(adaptee);
    }
}
