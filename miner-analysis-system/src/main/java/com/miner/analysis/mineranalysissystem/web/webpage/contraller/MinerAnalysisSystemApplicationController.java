package com.miner.analysis.mineranalysissystem.web.webpage.contraller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("get")
//程序启动时加载指定的资源
@PropertySource(value = "classpath:/properties/MinerAnalysisSystemApplication",encoding = "utf8")
public class MinerAnalysisSystemApplicationController {
    @Value("${MinerAnalysisSystemApplication.host}")   //spel表达式，spring将数据扫描到容器中时才取值
    private String host;         //     = "127.0.0.1";
    @Value("${MinerAnalysisSystemApplication.port}")
    private int port;           //= 6379;

    @RequestMapping("get")
    public String get() {
        return host + "|" + port;
    }

    @RequestMapping ("/minerTest")
    public String minerTest() {
        return "minerTest";
    }
}
