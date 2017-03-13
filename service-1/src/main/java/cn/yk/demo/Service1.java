package cn.yk.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * <br> Project: spring-cloud-demo
 * <br> Package: cn.yk.demo.application
 * <br> Description:服务1
 * <br> Date: Created in 12:03 2017/3/10.
 * <br> Modified By
 *
 * @author SiGen
 */
//@SpringBootApplication
////@EnableDiscoveryClient
//@EnableEurekaClient
//@EnableWebMvc
//@EnableFeignClients
@Configuration
@ComponentScan
@EnableAutoConfiguration
@EnableEurekaClient
@EnableFeignClients
public class Service1 {
    public static void main(String[] args) {
        SpringApplication.run(Service1.class,args);
    }
}
