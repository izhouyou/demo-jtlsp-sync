package com.izhouy.template.service.impl;

import com.izhouy.template.service.KafkaConsumerService;
import info.jiatu.jtlsp.common.response.Result;
import info.jiatu.jtlsp.common.util.ResultGeneratorUtils;
import org.springframework.stereotype.Service;

/**
 * @author izhou
 * @path com.izhouy.template.service.impl
 * @methodName ItemSyncServiceImpl
 * @description 馆藏同步
 * @dateTime 2022/11/6 09:35
 * @editNote
 */
@Service("itemSyncService")
public class ItemSyncServiceImpl implements KafkaConsumerService {
    @Override
    public Result save(String data) {
        return ResultGeneratorUtils.success("新增馆藏成功");
    }

    @Override
    public Result update(String data) {
        return ResultGeneratorUtils.success("更新馆藏成功");
    }

    @Override
    public Result delete(String data) {
        return ResultGeneratorUtils.success("删除馆藏成功");
    }

    @Override
    public String getType() {
        return "HOLDING";
    }

    public Result query(String data) {
        return ResultGeneratorUtils.success("查询成功:" + data);
    }
}
