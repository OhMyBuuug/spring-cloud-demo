package cn.yk.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <br> Project: spring-cloud-demo
 * <br> Package: cn.yk.demo.controller
 * <br> Description:
 * <br> Date: Created in 14:19 2017/3/10.
 * <br> Modified By
 *
 * @author SiGen
 */
@RestController
public class HelloController {
    @GetMapping("helloService0")
    public String helloService0(){
        return "Hello,I am service0!";
    }
}
