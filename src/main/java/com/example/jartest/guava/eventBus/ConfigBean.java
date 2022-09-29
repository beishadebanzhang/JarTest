package com.example.jartest.guava.eventBus;

import com.google.common.eventbus.AsyncEventBus;
import com.google.common.eventbus.EventBus;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@Configuration
public class ConfigBean {

    /**
     * 注册事件发送器
     */
    @Bean
    public EventBus executorService() {
        BlockingQueue<Runnable> taskQueue = new LinkedBlockingQueue<>(20);
        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                5, 20, 30, TimeUnit.SECONDS, taskQueue);
        return new AsyncEventBus(executor);
    }

}
