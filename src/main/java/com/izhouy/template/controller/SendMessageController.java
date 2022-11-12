package com.izhouy.template.controller;

import com.izhouy.template.domain.dto.SendMessageDto;
import com.izhouy.template.factory.HandlerFactory;
import com.izhouy.template.service.SendMessageService;
import info.jiatu.jtlsp.common.enumeration.ResultCode;
import info.jiatu.jtlsp.common.response.Result;
import info.jiatu.jtlsp.common.util.ValidateUtils;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author izhou
 * @path com.izhouy.template.controller
 * @methodName SendMessageController
 * @description 消息发送接口管理
 * @dateTime 2022/11/12 15:22
 * @editNote
 */
@RestController
@RequestMapping("/message")
@Api(value = "消息发送接口管理")
public class SendMessageController {

    @Resource
    private HandlerFactory<String, SendMessageService> sendMessageServiceFactory;

    @PostMapping("/send")
    public Result sendMessage(SendMessageDto dto) {
        SendMessageService sendMessageService = sendMessageServiceFactory.getStrategy(dto.getSendMethod());
        ValidateUtils.notNull(sendMessageService, ResultCode.FAIL.code(), "消息发送方式不存在!!!");
        return sendMessageService.sendMessage(dto);
    }



}
