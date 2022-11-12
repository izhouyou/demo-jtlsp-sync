package com.izhouy.template.domain.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * @author izhou
 * @path com.izhouy.template.domain.dto
 * @methodName SendMessageDto
 * @description 发送消息接口参数DTO
 * @dateTime 2022/11/12 15:17
 * @editNote
 */
@Getter
@Setter
@ApiModel(value = "发送消息接口参数")
public class SendMessageDto implements Serializable {
    @NotBlank
    @ApiModelProperty(value = "标题")
    private String title;
    @ApiModelProperty(value = "发送方式")
    private String sendMethod;
    @ApiModelProperty(value = "消息内容")
    private String message;
}
