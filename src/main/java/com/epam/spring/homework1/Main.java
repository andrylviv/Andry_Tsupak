package com.epam.spring.homework1;

import com.epam.spring.homework1.config.BeansConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args){
        ApplicationContext context = new AnnotationConfigApplicationContext(BeansConfig.class);
        for (String beanDefinitionName:context.getBeanDefinitionNames()) {
            System.out.println(beanDefinitionName);
        }
       ((AnnotationConfigApplicationContext) context).close();
    }
}