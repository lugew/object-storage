package com.github.lugew.objectstorage.tencentspringbootstarter;


import com.qcloud.cos.COSClient;
import com.qcloud.cos.transfer.TransferManager;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 腾讯复杂对象存储
 *
 * @author LuGew
 * @since 2020/10/22
 */

public class AdvancedTencentCOS extends AbstractTencentCOS {
    private final int threadsCount = 32;
    private final TransferManager transferManager;

    public AdvancedTencentCOS(
            String url,
            String id,
            String key,
            String bucketName,
            String region,
            COSClient client
    ) {

        super(url, id, key, bucketName, region, client);
        ExecutorService executorService = Executors.newFixedThreadPool(this.threadsCount);
        transferManager = new TransferManager(this.client, executorService);

    }

   /* @Override
    public java.lang.Object put(String key, File file) {
        try {
            Upload upload = transferManager.upload(new PutObjectRequest(getBucket(), key, file));
            return upload.waitForUploadResult();
        } catch (Exception e) {
            throw new RuntimeException("11");
//            throw new Exception(Error.UPLOAD_FAILED.getCode(), e);
        }
    }

    @Override
    public java.lang.Object put(String key, InputStream inputStream) {
        try {
            Upload upload = transferManager.upload(new PutObjectRequest(getBucket(), key, inputStream, new ObjectMetadata()));
            return upload.waitForUploadResult();
        } catch (Exception e) {
            throw new Exception(Error.UPLOAD_FAILED.getCode(), e);

        }
    }*/
}
