package com.uptown.guli.search.config;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.context.annotation.Configuration;

/**
 * @author: Lixiaofei
 * @date: 2021/5/30 18:13
 */
@Configuration
public class GuliElasticsearchConfig {


    public RestHighLevelClient EsRestClient() {
        return new RestHighLevelClient(
                RestClient.builder(new HttpHost("119.3.250.23", 9200, "http"))
        );
    }
}
