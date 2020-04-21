package com.yide.dubbo.nacos.provider.service;

import com.yide.api.EchoService;
import org.apache.dubbo.config.annotation.Service;

@Service(version = "1.0.0")
public class EchoServiceImpl implements EchoService {

    @Override
    public String echo(String string) {

        return "Echo Hello Dubbo " + string;
    }
}
