package com.izhouy.template.config;

import com.izhouy.template.factory.HandlerFactory;
import com.izhouy.template.service.KafkaConsumerService;
import com.izhouy.template.service.SendMessageService;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author izhou
 * @path com.izhouy.template.config
 * @methodName StrategicFactoryBeanConfig
 * @description
 * @dateTime 2022/11/10 15:53
 * @editNote
 */
@Component
public class StrategicFactoryBeanConfig {

    @Bean
    public HandlerFactory<String, KafkaConsumerService> kafkaConsumerServiceFactory() {
        return new HandlerFactory<>(KafkaConsumerService.class);
    }

    @Bean
    public HandlerFactory<String, SendMessageService> sendMessageServiceHandlerFactory() {
        return new HandlerFactory<>(SendMessageService.class);
    }
}
