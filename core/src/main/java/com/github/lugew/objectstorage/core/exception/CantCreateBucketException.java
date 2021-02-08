package com.github.lugew.objectstorage.core.exception;

/**
 * @author 夏露桂
 * @since 2021/2/8 15:13
 */
public class CantCreateBucketException extends RuntimeException {
    public CantCreateBucketException() {
    }

    public CantCreateBucketException(String message) {
        super(message);
    }

    public CantCreateBucketException(String message, Throwable cause) {
        super(message, cause);
    }

    public CantCreateBucketException(Throwable cause) {
        super(cause);
    }

    public CantCreateBucketException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
