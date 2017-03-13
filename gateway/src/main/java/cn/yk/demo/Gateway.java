package cn.yk.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * <br> Project: spring-cloud-demo
 * <br> Package: cn.yk.demo
 * <br> Description:接入网关,让服务有统一的入口
 * <br> Date: Created in 13:07 2017/3/10.
 * <br> Modified By
 *
 * @author SiGen
 */
@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class Gateway {
    public static void main(String[] args) {
        SpringApplication.run(Gateway.class, args);
    }
}
