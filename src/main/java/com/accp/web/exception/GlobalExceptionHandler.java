package com.accp.web.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description:
 * @Author: liyong
 * @CreateDate: 2018/1/16 17:41
 * @Version: 1.0
 */
@ControllerAdvice
public abstract class GlobalExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public String exception(Exception e){
        e.printStackTrace();
        return "系统错误";
    }
}
