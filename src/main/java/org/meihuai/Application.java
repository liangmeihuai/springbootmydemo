package org.meihuai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/** 
 *  
 * @author qq1623299667 
 * 
 */  
@SpringBootApplication
/**
 * @Configuration（@SpringBootConfiguration点开查看发现里面还是应用了@Configuration）
  @EnableAutoConfiguration
  @ComponentScan
 */
public class Application {  
  
    public static void main(String[] args) {  
        SpringApplication.run(Application.class, args);
        // 或者用以下启动方式
//        new SpringApplicationBuilder(Application.class).bannerMode(Banner.Mode.CONSOLE).web(true).run(args);
    }
  
}  