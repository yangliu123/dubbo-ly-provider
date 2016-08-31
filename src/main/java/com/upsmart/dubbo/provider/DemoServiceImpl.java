package com.upsmart.dubbo.provider;

import javax.ws.rs.Path;

import com.upsmart.api.DemoService;
@Path("demo")
public class DemoServiceImpl implements DemoService {
    public String sayHello(String name) {
        return "Hello " + name;
    }

}