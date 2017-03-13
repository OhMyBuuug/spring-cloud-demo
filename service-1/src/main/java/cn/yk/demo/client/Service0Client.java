package cn.yk.demo.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * <br> Project: spring-cloud-demo
 * <br> Package: cn.yk.demo.client
 * <br> Description: 将远程接口模拟成本地接口,方便调用
 * <br> Date: Created in 14:29 2017/3/10.
 * <br> Modified By
 *
 * @author SiGen
 */
// 目标的配置文件中spring.application.name
@FeignClient("service0")
public interface Service0Client {
    @RequestMapping(method = RequestMethod.GET,path = "/helloService0")
    String helloService0();
}
