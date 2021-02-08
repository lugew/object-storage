package com.github.lugew.objectstorage.tencentspringbootstarter;


import com.qcloud.cos.COSClient;
import lombok.extern.slf4j.Slf4j;

/**
 * 简单腾讯对象存储
 *
 * @author LuGew
 * @since 2020/10/22
 */
@Slf4j
public class SimpleTencentCOS extends AbstractTencentCOS {
    public SimpleTencentCOS(
            String url,
            String id,
            String key,
            String bucketName,
            String region,
            COSClient client
    ) {
        super(url, id, key, bucketName, region, client);
    }
}
