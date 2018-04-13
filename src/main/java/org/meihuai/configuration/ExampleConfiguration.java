package org.meihuai.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExampleConfiguration {    
    
    @Value("com.mysql.jdbc.Driver")
    private String driverClassName;    
    
    @Value("jdbc://xxxx.xx.xxx/xx")    
    private String driverUrl;    
    @Bean(name = "person")
    public Person person(){
        Person person =  new Person();
        person.setDriverClassName(driverClassName);
        person.setDriverUrl(driverUrl);
        return person;
    }
}  
