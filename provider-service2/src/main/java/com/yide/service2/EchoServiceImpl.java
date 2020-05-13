package com.yide.service2;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.yide.api.EchoService;
import org.apache.dubbo.config.annotation.Service;

@Service
public class EchoServiceImpl implements EchoService {

    @HystrixCommand
    @Override
    public String echo(String string) {

        return "Echo Hello Dubbo2 " + string;
    }
}
