package com.uptown.guli;

import com.aliyun.oss.OSSClient;
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

        InputStream inputStream = new FileInputStream("E:\\ChromeDownload\\cbf46ef427ded17a21be6b9190e7c678.jpeg");
        ossClient.putObject("guli-uptown", "me.jpg", inputStream);

        // 关闭OSSClient。
        ossClient.shutdown();

        System.out.println("success");
    }
}
