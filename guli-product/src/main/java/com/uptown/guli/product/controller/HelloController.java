package com.uptown.guli.product.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author: Lixiaofei
 * @date: 2021/2/15 17:04
 */
@RestController
public class HelloController {

    @RequestMapping("/")
    public Object hello() {
        return new Date();
    }
}
