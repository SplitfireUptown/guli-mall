package com.uptown.guli.product.Expection;

import com.uptown.common.exception.BizCodeEnum;
import com.uptown.common.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: Lixiaofei
 * @date: 2021/2/6 20:46
 */
@Slf4j
@RestControllerAdvice(basePackages = "com.uptown.guli.product.controller")
public class GuliExceptionGlobelAdvice {


    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public R handleVaildException(MethodArgumentNotValidException e) {
        log.error("数据校验出现问题{}, 异常类型{}", e.getMessage(), e.getClass());


        Map<String, String> errorMap = new HashMap<>();
        BindingResult bindingResult = e.getBindingResult();
        bindingResult.getFieldErrors().forEach(i -> {
            errorMap.put(i.getField(), i.getDefaultMessage());
        });
        return R.error(BizCodeEnum.BAILD_EXCEPTION.getCode(), BizCodeEnum.BAILD_EXCEPTION.getErrorMsg()).put("data", errorMap);

    }

    @ExceptionHandler(value = Throwable.class)
    public R hanldException(Throwable e) {
        return R.error(BizCodeEnum.UNKONW_EXCEPTION.getCode(), BizCodeEnum.UNKONW_EXCEPTION.getErrorMsg());
    }

}
