package com.aspect.aopdemo.entity;

import org.springframework.stereotype.Component;

@Component
public class ErrorThrower {

    public void error() throws Exception{
        throw new Exception("Santa Claus is coming to town");
    }

}
