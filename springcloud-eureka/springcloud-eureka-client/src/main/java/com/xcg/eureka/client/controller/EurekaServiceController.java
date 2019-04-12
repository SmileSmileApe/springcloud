package com.xcg.eureka.client.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.logging.Logger;

@RestController
public class EurekaServiceController {


    private final Logger logger = Logger.getLogger(getClass().getSimpleName());

    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "index",method = RequestMethod.GET)
    public String index(){
        List<String> services = client.getServices();
        logger.info(services.toString());
        return "Hello World!";
    }


}
