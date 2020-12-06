package com.uptown.guli.member.feign;

import com.uptown.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: Lixiaofei
 * @date: 2020/12/6 19:01
 */
@FeignClient("guli-coupon")
public interface CouponFeignService {

    @RequestMapping("/coupon/coupon/member/list")
    public R memberCippon();
}
