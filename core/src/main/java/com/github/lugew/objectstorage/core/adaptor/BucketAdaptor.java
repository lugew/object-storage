package com.github.lugew.objectstorage.core.adaptor;

import com.github.lugew.objectstorage.core.Bucket;
import com.github.lugew.objectstorage.core.Owner;

import java.util.Date;

/**
 * @author 夏露桂
 * @since 2021/2/7 14:39
 */
public class BucketAdaptor<A, O> extends AbstractAdaptor<A> implements Bucket<A, O> {
    public BucketAdaptor(A adaptee) {
        super(adaptee);
    }

    @Override
    public Owner<O> getOwner() {
        return new OwnerAdaptor((O) invoke()) ;
    }

    @Override
    public void setOwner(Owner<O> owner) {
        invoke(owner.adaptee());
    }

    @Override
    public Date getCreationDate() {
        return (Date) invoke();
    }

    @Override
    public void setCreationDate(Date creationDate) {
        invoke(creationDate);
    }

    @Override
    public String getName() {
        return (String) invoke();
    }

    @Override
    public void setName(String name) {
        invoke(name);
    }

    @Override
    public String getLocation() {
        return (String) invoke();
    }

    @Override
    public void setLocation(String location) {
        invoke(location);
    }
}
