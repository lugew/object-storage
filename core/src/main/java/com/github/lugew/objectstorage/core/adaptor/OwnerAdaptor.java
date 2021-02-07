package com.github.lugew.objectstorage.core.adaptor;

import com.github.lugew.objectstorage.core.Owner;

/**
 * @author 夏露桂
 * @since 2021/2/7 15:21
 */
public class OwnerAdaptor<A> extends AbstractAdaptor<A> implements Owner<A> {
    public OwnerAdaptor(A adaptee) {
        super(adaptee);
    }

    @Override
    public String getId() {
        return (String) invoke();
    }

    @Override
    public void setId(String id) {
        invoke(id);
    }

    @Override
    public String getDisplayName() {
        return (String) invoke();
    }

    @Override
    public void setDisplayName(String name) {
        invoke(name);
    }
}
