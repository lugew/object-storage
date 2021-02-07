package com.github.lugew.objectstorage.core;

import java.io.Serializable;
import java.util.Map;

/**
 * @author 夏露桂
 * @since 2021/2/5 17:21
 */
public interface ObjectMetadata extends Serializable {
    public Map<String, String> getUserMetadata();

    public Map<String, java.lang.Object> getRawMetadata();
}
