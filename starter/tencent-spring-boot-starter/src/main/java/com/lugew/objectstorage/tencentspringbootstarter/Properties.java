package com.lugew.objectstorage.tencentspringbootstarter;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author 夏露桂
 * @since 2021/2/8 17:03
 */

@ConfigurationProperties(prefix = "object-storage.tencent")
public class Properties extends com.lugew.objectstorage.core.Properties {

}
