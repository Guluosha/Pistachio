package org.pistachio.utilities.publisher.base;

import com.google.common.collect.Sets;
import lombok.Data;
import lombok.experimental.SuperBuilder;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.pistachio.utilities.event.AbstractBusinessEvent;
import org.pistachio.utilities.listener.AbstractBusinessEventListener;
import org.pistachio.utilities.listener.ExceptionHandler;

import java.util.Set;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Copyright (c) 2007博睿宏远科技发展有限公司,Inc.All Rights Reserved.
 * <br/><b/>
 *
 * @author lipeiheng 2020/3/18 ~ 上午 12:43
 */

@Slf4j
@Data
@SuperBuilder
public abstract class AbstractBusinessEventPublisher implements BusinessEventPublisher {

    /**
     * 业务事件监听器集合
     */
    protected final Set<AbstractBusinessEventListener> businessEventListenerSet = Sets.newConcurrentHashSet();

    /**
     * 异常处理类
     */
    protected ExceptionHandler exceptionHandler;

    /**
     * 线程池
     */
    protected ThreadPoolExecutor threadPoolExecutor;

    /**
     * 添加事件监听器
     *
     * @param eventListener 监听器
     */
    public void registerEventListener(AbstractBusinessEventListener eventListener) {
        log.info("注册业务事件监听器:{}", eventListener);
        businessEventListenerSet.add(eventListener);
    }

    /**
     * 移除事件监听器
     *
     * @param eventListener 监听器
     */
    public void removeEventListener(AbstractBusinessEventListener eventListener) {
        log.info("注销业务事件监听器:{}", eventListener);
        businessEventListenerSet.remove(eventListener);
    }

    /**
     * 移除所有事件监听器
     */
    public void removeAllEventListener() {
        if (!businessEventListenerSet.isEmpty()) {
            businessEventListenerSet.clear();
            log.info("注销所有业务事件监听器");
        }
    }

    /**
     * 注册事件监听器集合
     *
     * @param eventListenerSet 监听器集合
     */
    public void registerEventListenerSet(Set<AbstractBusinessEventListener> eventListenerSet) {
        log.info("注册业务事件监听器集合:{}", eventListenerSet);
        this.businessEventListenerSet.addAll(eventListenerSet);
    }

    /**
     * 注销监听器集合
     *
     * @param eventListenerSet 监听器集合
     */
    public void removeEventListenerSet(Set<AbstractBusinessEventListener> eventListenerSet) {
        log.info("注销业务事件监听器集合:{}", eventListenerSet);
        this.businessEventListenerSet.removeAll(eventListenerSet);
    }

    /**
     * 发布事件给注册的监听器处理
     *
     * @param event 事件
     */
    @Override
    public void publishEvent(AbstractBusinessEvent event) {
        for (AbstractBusinessEventListener businessEventListener : businessEventListenerSet) {
            threadPoolExecutor.execute(() -> {
                try {
                    if (event == null || event.getSource() == null) {
                        log.warn("业务事件为空!，不发布任何业务事件信息");
                        return;
                    }
                    log.info("业务事件监听器:{},开始处理事件:{}", businessEventListener.getClass().getName(), StringUtils.isBlank(event.getEventName()) ? event : event.getEventName());
                    businessEventListener.onBusinessEvent(event);
                } catch (Exception exception) {
                    log.error("处理事件异常", exception);
                }
            });
        }
    }

}
