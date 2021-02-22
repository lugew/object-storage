package com.lugew.objectstorage.tencentspringbootstarter;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author 夏露桂
 * @since 2021/2/8 17:03
 */

@ConfigurationProperties(prefix = "object-storage.tencent")
@Getter
@Setter
public class Properties {
    private String uri;
    private String id;
    private String key;
    private String bucketName;
    private String region;
}
