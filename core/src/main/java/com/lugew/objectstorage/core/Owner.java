package com.lugew.objectstorage.core;

/**
 * @author 夏露桂
 * @since 2021/2/5 15:18
 */
public interface Owner<O> extends Adaptor<O> {
    String toString();

    String getId();

    void setId(String id);

    String getDisplayName();

    void setDisplayName(String name);

    int hashCode();

}
