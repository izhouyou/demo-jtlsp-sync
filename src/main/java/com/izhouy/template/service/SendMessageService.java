package com.izhouy.template.service;

import com.izhouy.template.domain.dto.SendMessageDto;
import com.izhouy.template.factory.GenericInterface;
import info.jiatu.jtlsp.common.response.Result;

/**
 * @author izhou
 * @path com.izhouy.template.service
 * @methodName SendMessageService
 * @description
 * @dateTime 2022/11/12 15:25
 * @editNote
 */
public interface SendMessageService extends GenericInterface<String> {

    Result sendMessage(SendMessageDto dto);

}
