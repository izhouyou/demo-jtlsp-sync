package com.izhouy.template.common.observer;

import com.izhouy.template.domain.LogErrorInfo;
import com.izhouy.template.domain.LogInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author izhou
 * @path com.izhouy.template.listener
 * @methodName EventPubListener
 * @description Log时间发布者
 * @dateTime 2022/11/5 22:45
 * @editNote
 */
@Component
public class LogEventPublisher {
    @Autowired
    private ApplicationContext applicationContext;

    // 事件发布方法
    public void pushListener(LogInfo sysLogEvent) {
        applicationContext.publishEvent(sysLogEvent);
    }

    // 事件发布方法
    public void pushErrorLogEvent(LogErrorInfo sysLogEvent) {
        applicationContext.publishEvent(sysLogEvent);
    }
}