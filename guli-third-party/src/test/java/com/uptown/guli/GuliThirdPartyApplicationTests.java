package com.uptown.guli;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClient;
import com.aliyun.oss.OSSClientBuilder;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileInputStream;
import java.io.InputStream;

@SpringBootTest
class GuliThirdPartyApplicationTests {

    @Autowired
    OSSClient ossClient;


    @Test
    void contextLoads() {

    }


    @SneakyThrows
    @Test
    public void testUpload() {
//        String endpoint = "http://oss-cn-beijing.aliyuncs.com";
//        String accessKeyId = "LTAI4G9niwzj7HGqPruhYFwX";
//        String accessKeySecret = "fMJj2CQULqH1fAderxYhiWTJQGoNqt";
//
//        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);

        InputStream inputStream = new FileInputStream("E:\\ChromeDownload\\cbf46ef427ded17a21be6b9190e7c678.jpeg");
        ossClient.putObject("guli-uptown", "me.jpg", inputStream);

// 关闭OSSClient。
        ossClient.shutdown();

        System.out.println("success");
    }
}
