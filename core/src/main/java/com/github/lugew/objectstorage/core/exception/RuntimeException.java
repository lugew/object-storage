package com.github.lugew.objectstorage.core.exception;

import lombok.Getter;
import lombok.Setter;

/**
 * @author 夏露桂
 * @since 2021/2/8 15:11
 */
@Getter
@Setter
public class RuntimeException extends java.lang.RuntimeException {
    private String key;

    public RuntimeException() {
    }

    public RuntimeException(String message) {
        super(message);
        this.key = message;
    }

    public RuntimeException(String message, Throwable cause) {
        super(message, cause);
        this.key = message;
    }

    public RuntimeException(Throwable cause) {
        super(cause);
    }

    public RuntimeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
