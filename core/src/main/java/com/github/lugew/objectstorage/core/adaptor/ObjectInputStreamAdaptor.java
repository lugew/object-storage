package com.github.lugew.objectstorage.core.adaptor;

import com.github.lugew.objectstorage.core.ObjectInputStream;

/**
 * @author 夏露桂
 * @since 2021/2/7 16:54
 */
public class ObjectInputStreamAdaptor<A> extends AbstractAdaptor<A> implements ObjectInputStream {
    public ObjectInputStreamAdaptor(A adaptee) {
        super(adaptee);
    }
}
