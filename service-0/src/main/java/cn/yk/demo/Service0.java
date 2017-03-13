package cn.yk.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * <br> Project: spring-cloud-demo
 * <br> Package: cn.yk.demo.application
 * <br> Description:服务0
 * <br> Date: Created in 12:03 2017/3/10.
 * <br> Modified By
 *
 * @author SiGen
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
@EnableWebMvc
public class Service0 {
    public static void main(String[] args) {
        SpringApplication.run(Service0.class,args);
    }
}
