package com.izhouy.template.service;

import com.izhouy.template.factory.GenericInterface;
import info.jiatu.jtlsp.common.response.Result;

/**
 * @author izhou
 * @path com.izhouy.template.service
 * @methodName KafkaConsumerService
 * @description kafka消费者公共接口
 * @dateTime 2022/11/6 09:32
 * @editNote
 */
public interface KafkaConsumerService extends GenericInterface<String> {

    Result save(String data);

    Result update(String data);

    Result delete(String data);

}
