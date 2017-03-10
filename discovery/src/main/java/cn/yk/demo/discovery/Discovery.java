package cn.yk.demo.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * <br> Project: spring-cloud-demo
 * <br> Package: cn.yk.demo.service1
 * <br> Description:注册中心--eureka服务端
 * <br> Date: Created in 11:50 2017/3/10.
 * <br> Modified By
 *
 * @author SiGen
 */
@SpringBootApplication
@EnableEurekaServer
public class Discovery {
    public static void main(String[] args) {
        SpringApplication.run(Discovery.class,args);
    }
}
