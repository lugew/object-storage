package com.github.lugew.objectstorage.tencent

import com.github.lugew.objectstorage.core.ObjectStorage
import com.qcloud.cos.COSClient
import com.qcloud.cos.exception.CosClientException
import com.qcloud.cos.exception.CosServiceException
import com.qcloud.cos.model.Bucket
import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Subject

/**
 *
 * @author 夏露桂* @since 2021/2/8 12:29
 */
@Subject(SimpleTencentObjectStorage)
class SimpleTencentCOSSpec extends Specification {
    @Shared
    ObjectStorage objectStorage
    def url = "https://asdfadfa.cos.ap-shanghai.myqcloud.com/"
    def id = "dfasdfasdfaZrEDw7E9VhkgOrAdfaG"
    def key = "asdfasdfasdfMDnAUVPffky0oNBO"
    def bucketName = "adfafdsa"
    def region = "ap-shanghai"
    COSClient client = Mock()

    def setup() {
        objectStorage = new SimpleTencentObjectStorage(url, id, key, bucketName, region, client)

    }

    def "创建桶失败抛出异常"() {
        given: "指定抛出异常类型"
        client.createBucket(_ as String) >> { throw type.getDeclaredConstructor(String.class).newInstance(result) }

        when: "创建桶"
        objectStorage.createBucket("123")

        then: "获取到异常"
        def exception = thrown(type)
        with(exception) {
            message == result + addtion
        }
        where: "异常例子"
        type                      || result  || addtion
        CosClientException.class  || "error" || ""
        CosServiceException.class || "cos"   || " (Status Code: 0; Error Code: null; Request ID: null); Trace ID: null"
    }

    def "创建桶返回的接口可以正常使用"() {
        given: "创建桶返回桶对象"
        String bucketName = "bucketTestName"
        client.createBucket(_ as String) >> new Bucket(bucketName)
        expect: "桶对象正常"
        with(objectStorage.createBucket(bucketName)) {
            getName() == bucketName
        }
    }
}
