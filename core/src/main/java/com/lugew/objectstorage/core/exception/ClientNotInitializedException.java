package com.lugew.objectstorage.core.exception;

/**
 * @author 夏露桂
 * @since 2021/2/22 10:46
 */
public class ClientNotInitializedException extends RuntimeException {
    private static final String KEY = "client.not.initialized";

    public ClientNotInitializedException() {
        super(KEY, KEY);
    }

    public ClientNotInitializedException(String message) {
        super(KEY, message);
    }

    public ClientNotInitializedException(String message, Throwable cause) {
        super(KEY, message, cause);
    }

    public ClientNotInitializedException(Throwable cause) {
        super(KEY, cause);
    }
}
