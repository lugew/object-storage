package com.github.lugew.objectstorage.core;


import java.io.Serializable;
import java.util.Date;

/**
 * 桶接口，封装桶对象的操作
 *
 * @author 夏露桂
 * @since 2021/2/4 16:35
 */
public interface Bucket<A, O> extends Serializable, Adaptor<A> {
    String toString();

    Owner<O> getOwner();

    void setOwner(Owner<O> owner);

    Date getCreationDate();

    void setCreationDate(Date creationDate);

    String getName();

    void setName(String name);

    String getLocation();

    void setLocation(String location);
}
