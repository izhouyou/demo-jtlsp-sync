package com.izhouy.template.common.observer;

import com.izhouy.template.domain.LogErrorInfo;
import com.izhouy.template.domain.LogInfo;
import com.izhouy.template.service.LogErrorInfoService;
import com.izhouy.template.service.LogInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author izhou
 * @path com.izhouy.template.listener
 * @methodName LogEventListener
 * @description Log事件观察者
 * @dateTime 2022/11/5 22:46
 * @editNote
 */

@Slf4j
@Component
public class LogEventObserver {

    @Resource
    private LogInfoService logInfoService;
    @Resource
    private LogErrorInfoService logErrorInfoService;

    // 开启异步
    @Async
    // 开启监听
    @EventListener(LogInfo.class)
    public void saveSysLog(LogInfo event) {
        logInfoService.save(event);
    }

    // 开启异步
    @Async
    // 开启监听
    @EventListener(LogErrorInfo.class)
    public void saveSysLog(LogErrorInfo event) {
        logErrorInfoService.save(event);
    }
}
