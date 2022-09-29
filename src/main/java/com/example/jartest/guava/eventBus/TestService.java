package com.example.jartest.guava.eventBus;

import com.google.common.eventbus.EventBus;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

/**
 * 注册与事件发送
 */
@Service
@RequiredArgsConstructor
public class TestService implements InitializingBean {

    private final EventListener eventListener;

    private final EventBus eventBus;

    public void postEvent() {
        eventBus.post("123");
        Message message = Message.builder()
                .name("自定义消息1")
                .score(10)
                .desc("我是自定义消息")
                .build();
        eventBus.post(message);
    }

    /**
     * 注册事件监听器
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        eventBus.register(eventListener);
        postEvent();
    }
}
