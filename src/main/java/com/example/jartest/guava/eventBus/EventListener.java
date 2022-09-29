package com.example.jartest.guava.eventBus;

import com.alibaba.fastjson2.JSONObject;
import com.google.common.eventbus.Subscribe;
import org.springframework.stereotype.Component;

/**
 * 事件监听器
 */
@Component
public class EventListener {

    @Subscribe
    public void listenerMessage(Message message) {
        System.out.println("[listenerMessage]: " + JSONObject.toJSONString(message));
    }

    @Subscribe
    public void listenerString(String message) {
        System.out.println("[listenerString]: " + message);
    }

}
