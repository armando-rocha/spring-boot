package com.springbootApi.springbootApi.configuration;

import com.springbootApi.springbootApi.bean.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfigurationBean {
    @Bean
    public MyBean beanOperation(){
        return new MyBeanImplementTwo();
    }
    @Bean
    public MyOperationImplement beanOperationSum(){
        return  new MyOperationImplement();
    }
    @Bean
    public MyBeanWithDependency beanOperationWithDependency(MyOperation myOperation){
        return  new MyBeanWithDependencyImplement(myOperation);
    }

}
