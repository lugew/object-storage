package com.lugew.objectstorage.core.exception;

/**
 * @author 夏露桂
 * @since 2021/2/22 10:46
 */
public class CantPutObjectException extends RuntimeException {
    private static final String KEY = "can.not.put.object";

    public CantPutObjectException() {
        super(KEY, KEY);
    }

    public CantPutObjectException(String message) {
        super(KEY, message);
    }

    public CantPutObjectException(String message, Throwable cause) {
        super(KEY, message, cause);
    }

    public CantPutObjectException(Throwable cause) {
        super(KEY, cause);
    }
}
