package com.github.lugew.objectstorage.core.adaptor;


import com.github.lugew.objectstorage.core.Adaptor;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;

/**
 * @author 夏露桂
 * @since 2021/2/7 11:58
 */
public abstract class AbstractAdaptor<A> implements Adaptor<A> {
    private final A adaptee;
    private final Class<A> adapteeClass;


    public AbstractAdaptor(A adaptee) {
        this.adaptee = adaptee;
        adapteeClass = getAdapteeClass();
    }


    @Override
    public A adaptee() {
        return adaptee;
    }

    @Override
    public java.lang.Object invoke(String methodName, java.lang.Object... arguments) {
        java.lang.Object result = null;
        try {
            result = adapteeClass.getDeclaredMethod(methodName).invoke(adaptee, arguments);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public java.lang.Object invoke(java.lang.Object... arguments) {
        return invoke(Thread.currentThread().getStackTrace()[2].getMethodName(), arguments);
    }

    @Override
    public java.lang.Object invoke() {
        return invoke(Thread.currentThread().getStackTrace()[2].getMethodName());
    }

    private Class<A> getAdapteeClass() {
        return (Class<A>) ((ParameterizedType) getClass()
                .getGenericSuperclass()).getActualTypeArguments()[0];
    }

}
