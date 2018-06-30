package com.study4j.distMall.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;

@SpringBootApplication
@EnableAutoConfiguration
public class DistMallServiceApplication implements EmbeddedServletContainerCustomizer {

    @Value("${server.port}")
    private int springPort;

    public static void main(String[] args) {
        SpringApplication.run(DistMallServiceApplication.class, args);
    }

    @Override
    public void customize(ConfigurableEmbeddedServletContainer configurableEmbeddedServletContainer) {
        configurableEmbeddedServletContainer.setPort(springPort);
    }
}
