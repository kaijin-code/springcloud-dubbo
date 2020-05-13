package com.yide.dubbo.nacos.consumer.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.yide.api.EchoService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoController {

    @Reference(cluster = "failback")
    private EchoService echoService;

    @HystrixCommand(fallbackMethod = "test1")
    @GetMapping("/pay/echo/{string}")
    public String echo(@PathVariable String string){

        return echoService.echo(string);
    }

    @GetMapping("/pay/balance/{id}")
    public Long gateway(@PathVariable("id") String id){
        return System.currentTimeMillis();
    }

    public String test1(){
        return "dubbo exception....";
    }
}
