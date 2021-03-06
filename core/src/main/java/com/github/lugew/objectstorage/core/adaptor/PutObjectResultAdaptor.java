package com.github.lugew.objectstorage.core.adaptor;

import com.github.lugew.objectstorage.core.AbstractResultAdaptor;
import com.github.lugew.objectstorage.core.PutObjectResult;

/**
 * @author 夏露桂
 * @since 2021/2/7 15:35
 */
public class PutObjectResultAdaptor<A, OM> extends AbstractResultAdaptor<A, OM> implements PutObjectResult<A, OM> {
    public PutObjectResultAdaptor(A adaptee) {
        super(adaptee);
    }


}
