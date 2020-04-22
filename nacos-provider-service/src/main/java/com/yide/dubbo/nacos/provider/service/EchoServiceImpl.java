package com.yide.dubbo.nacos.provider.service;

import com.yide.api.EchoService;
import org.apache.dubbo.config.annotation.Service;

@Service
public class EchoServiceImpl implements EchoService {

    @Override
    public String echo(String string) {

        return "Echo Hello Dubbo " + string;
    }
}
