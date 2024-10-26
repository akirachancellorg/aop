package com.aspect.aopdemo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.aspect.aopdemo")
@ComponentScan(basePackages = {"com.aspect.aopdemo.aspect", "com.aspect.aopdemo.entity"})
@EnableAspectJAutoProxy
public class AppConfig {
}
