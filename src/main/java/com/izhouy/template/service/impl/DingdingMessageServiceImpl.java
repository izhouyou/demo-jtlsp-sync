package com.izhouy.template.service.impl;

import com.izhouy.template.domain.dto.SendMessageDto;
import com.izhouy.template.service.SendMessageService;
import info.jiatu.jtlsp.common.response.Result;
import info.jiatu.jtlsp.common.util.ResultGeneratorUtils;
import org.springframework.stereotype.Service;

/**
 * @author izhou
 * @path com.izhouy.template.service.impl
 * @methodName DingdingMessageServiceImpl
 * @description 钉钉消息发送
 * @dateTime 2022/11/12 15:35
 * @editNote
 */
@Service
public class DingdingMessageServiceImpl implements SendMessageService {
    @Override
    public String getType() {
        return "DINGDING";
    }

    @Override
    public Result sendMessage(SendMessageDto dto) {
        return ResultGeneratorUtils.success("发送成功");
    }
}
