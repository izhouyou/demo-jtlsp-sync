package com.izhouy.template.factory;

import com.izhouy.template.service.KafkaConsumerService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * @author izhou
 * @path com.izhouy.template.factory
 * @methodName StrategyModeTest
 * @description 策略设计模式测试
 * @dateTime 2022/11/11 17:44
 * @editNote
 */
@SpringBootTest
class StrategyModeTests {

    @Resource
    HandlerFactory<String, KafkaConsumerService> kafkaConsumerServiceFactory;

    @Test
    void itemSyncTest() {
        KafkaConsumerService item = kafkaConsumerServiceFactory.getStrategy("HOLDING");
        System.out.println(item.save("").getData());
    }
}
