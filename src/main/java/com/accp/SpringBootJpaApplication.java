package com.accp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * @Description:
 * @Author: liyong
 * @CreateDate: 2018/1/16 18:40
 * @Version: 1.0
 */
@SpringBootApplication
public class SpringBootJpaApplication extends SpringBootServletInitializer{

    public static void main(String[] args) {
        SpringApplication.run(SpringBootJpaApplication.class,args);
    }
}
