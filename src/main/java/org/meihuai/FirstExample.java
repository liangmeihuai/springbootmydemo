//package org.meihuai;
//
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
//import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
//import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
///**
// * 如何代码里面修改springboot的端口号
// */
//@RestController
//@EnableAutoConfiguration
//@ComponentScan
//public class FirstExample implements EmbeddedServletContainerCustomizer {
//
//    @RequestMapping("/first.do")
//    String home() {
//        return "Hello World！世界你好！O(∩_∩)O哈哈~！！！我不是太很好!";
//    }
//
//    public static void main(String[] args) {
//
//        SpringApplication.run(FirstExample.class, args);
//    }
//
//    @Override
//    public void customize(ConfigurableEmbeddedServletContainer configurableEmbeddedServletContainer) {
//
//        configurableEmbeddedServletContainer.setPort(8003);
//    }
//}