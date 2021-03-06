package com.github.lugew.objectstorage.core.adaptor;

import com.github.lugew.objectstorage.core.AbstractResultAdaptor;
import com.github.lugew.objectstorage.core.GetObjectResult;

/**
 * @author 夏露桂
 * @since 2021/2/8 11:46
 */
public class GetObjectResultAdaptor<A, OM> extends AbstractResultAdaptor<A, OM> implements GetObjectResult<A, OM> {
    public GetObjectResultAdaptor(A adaptee) {
        super(adaptee);
    }
}
