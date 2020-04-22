package com.yide.dubbo.nacos.consumer.controller;

import com.yide.api.EchoService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoController {

    @Reference
    private EchoService echoService;

    @GetMapping("/pay/echo/{string}")
    public String echo(@PathVariable String string){

        return echoService.echo(string);
    }

    @GetMapping("/pay/balance/{id}")
    public Long gateway(@PathVariable("id") String id){
        return System.currentTimeMillis();
    }
}
