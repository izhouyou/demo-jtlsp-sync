package com.izhouy.template.listener;

import com.izhouy.template.service.KafkaConsumerService;
import info.jiatu.jtlsp.common.response.Result;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author izhou
 * @path com.izhouy.template.listener
 * @methodName KafkaConsumeListener
 * @description kafka消费者
 * @dateTime 2022/11/6 08:47
 * @editNote
 */
@Service
public class KafkaConsumeListener {

    @Resource(name = "itemSyncService")
    private KafkaConsumerService itemSyncService;

    public Result consumer(String data) {
        long timeMillis = System.currentTimeMillis();
        if (timeMillis % 3 == 0) {
            return itemSyncService.save(data);
        } else if (timeMillis % 3 == 1) {
            return itemSyncService.update(data);
        } else {
            return itemSyncService.delete(data);
        }
    }
}
