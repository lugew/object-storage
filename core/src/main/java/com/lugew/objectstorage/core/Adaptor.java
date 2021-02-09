package com.lugew.objectstorage.core;

/**
 * @author 夏露桂
 * @since 2021/2/7 11:37
 */
public interface Adaptor<A> {
    A adaptee();

    java.lang.Object invoke(String methodName, java.lang.Object... arguments);

    java.lang.Object invoke(java.lang.Object... arguments);

    java.lang.Object invoke();
}
