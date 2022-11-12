package com.izhouy.template.service.impl;

import com.izhouy.template.service.KafkaConsumerService;
import info.jiatu.jtlsp.common.response.Result;
import info.jiatu.jtlsp.common.util.ResultGeneratorUtils;
import org.springframework.stereotype.Service;

/**
 * @author izhou
 * @path com.izhouy.template.service.impl
 * @methodName InstanceSyncServiceImpl
 * @description 书目同步
 * @dateTime 2022/11/6 09:35
 * @editNote
 */
@Service("instanceSyncService")
public class InstanceSyncServiceImpl implements KafkaConsumerService {
    @Override
    public Result save(String data) {
        return ResultGeneratorUtils.success("新增书目成功");
    }

    @Override
    public Result update(String data) {
        return ResultGeneratorUtils.success("更新书目成功");
    }

    @Override
    public Result delete(String data) {
        return ResultGeneratorUtils.success("删除书目成功");
    }

    @Override
    public String getType() {
        return "BIBLIOS";
    }
}
