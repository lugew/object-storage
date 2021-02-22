package com.lugew.objectstorage.tencent

import com.lugew.objectstorage.core.ObjectStorage
import software.amazon.awssdk.awscore.exception.AwsServiceException
import software.amazon.awssdk.core.exception.SdkClientException
import software.amazon.awssdk.core.sync.RequestBody
import software.amazon.awssdk.services.s3.S3Client
import software.amazon.awssdk.services.s3.model.PutObjectRequest
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
    S3Client client = Mock()

    def setup() {
        objectStorage = new SimpleTencentObjectStorage(url, id, key, bucketName, region, client)
    }

    def "上传文件失败抛出异常"() {
        given: "指定抛出异常类型"
        File file = new File("src/test/groovy/com/lugew/objectstorage/tencent/file.txt")
        client.putObject(_ as PutObjectRequest, _ as RequestBody) >> {
            throw content
        }

        when: "上传"
        objectStorage.putObject("file.txt", file)

        then: "获取到异常"
        def exception = thrown(type)
        with(exception) {
            message == result
        }
        where: "异常例子"
        type                      || content                                                      || result
        AwsServiceException.class || AwsServiceException.class.builder().message("error").build() || "error"
        SdkClientException.class  || SdkClientException.class.builder().message("cos").build()    || "cos"
    }
}
