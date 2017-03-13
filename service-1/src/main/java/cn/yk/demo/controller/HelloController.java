package cn.yk.demo.controller;

import cn.yk.demo.client.Service0Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <br> Project: spring-cloud-demo
 * <br> Package: cn.yk.demo.controller
 * <br> Description:
 * <br> Date: Created in 14:12 2017/3/10.
 * <br> Modified By
 *
 * @author SiGen
 */
@RestController
public class HelloController {
    @Autowired
    Service0Client service0Client;

    @GetMapping("helloService1")
    public String service1(){
         return "Hello,I am service1!";
    }

    @GetMapping("testRemoteCallAsLocal")
    public String testRemoteCallAsLocal(){
        String result = service0Client.helloService0();
        return result;
    }
}
