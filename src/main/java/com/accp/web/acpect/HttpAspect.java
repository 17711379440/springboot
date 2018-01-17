package com.accp.web.acpect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * @Description:
 * @Author: liyong
 * @CreateDate: 2018/1/16 17:58
 * @Version: 1.0
 */
@Aspect
@Component
public class HttpAspect {
    private  static  final Logger LOGGER = LoggerFactory.getLogger(HttpAspect.class);

    /**
     * 以这个方法作为切入点
     */
   @Pointcut("execution(* com.accp.web.controller..*(..))")
    public  void log(){
    }

    @Before("log()")
    public void doBefore(JoinPoint joinPoint){
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
       //url
        LOGGER.info("url={}",request.getRequestURI());

        //method
        LOGGER.info("method={}",request.getMethod());

        //ip
        LOGGER.info("ip={}",request.getRemoteAddr());

        //class_function
        LOGGER.info("class_method={}",joinPoint.getSignature().getDeclaringTypeName()+"."+joinPoint.getSignature().getName());

        //param
        LOGGER.info("args={} ",joinPoint.getArgs());
    }

    @After("log()")
    public  void doAfter(){

    }
}
