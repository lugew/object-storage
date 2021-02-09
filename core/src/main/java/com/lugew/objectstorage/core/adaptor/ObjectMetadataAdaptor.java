package com.lugew.objectstorage.core.adaptor;

import com.lugew.objectstorage.core.ObjectMetadata;

import java.util.Map;

/**
 * @author 夏露桂
 * @since 2021/2/7 16:06
 */
public class ObjectMetadataAdaptor<A> extends AbstractAdaptor<A> implements ObjectMetadata<A> {
    public ObjectMetadataAdaptor(A adaptee) {
        super(adaptee);
    }

    @Override
    public Map<String, String> getUserMetadata() {
        return (Map<String, String>) invoke();
    }

    @Override
    public Map<String, Object> getRawMetadata() {
        return (Map<String, Object>) invoke();
    }
}
