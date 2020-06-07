package org.pistachio.utilities.publisher.base;

import com.google.common.collect.Sets;
import org.pistachio.utilities.event.AbstractBusinessEvent;
import org.pistachio.utilities.listener.BusinessEventListener;
import org.pistachio.utilities.listener.ExceptionHandler;

import java.util.Set;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Copyright (c) 2007博睿宏远科技发展有限公司,Inc.All Rights Reserved.
 * <br/><b/>
 *
 * @author lipeiheng 2020/3/18 ~ 上午 12:43
 */

public abstract class AbstractBusinessEventPublisher implements BusinessEventPublisher {

    protected Set<BusinessEventListener> businessEventListenerSet = Sets.newConcurrentHashSet();

    protected ExceptionHandler exceptionHandler;

    protected ThreadPoolExecutor threadPoolExecutor;

    /**
     * 设置线程池
     *
     * @param threadPoolExecutor 线程池对象
     */
    protected abstract void setThreadPoolExecutor(ThreadPoolExecutor threadPoolExecutor);

    /**
     * 添加事件监听器
     *
     * @param listener 监听器
     */
    @Override
    public void registerEventListener(BusinessEventListener listener) {
        businessEventListenerSet.add(listener);
    }

    /**
     * 移除事件监听器
     *
     * @param listener 监听器
     */
    @Override
    public void removeEventListener(BusinessEventListener listener) {
        businessEventListenerSet.remove(listener);
    }

    /**
     * 移除所有事件监听器
     */
    @Override
    public void removeAllEventListener() {
        if (!businessEventListenerSet.isEmpty()) {
            businessEventListenerSet.clear();
        }
    }

    /**
     * 发布事件给注册的监听器处理
     *
     * @param event 事件
     */
    @Override
    public void publishEvent(AbstractBusinessEvent event) {
        for (BusinessEventListener businessEventListener : businessEventListenerSet) {
            threadPoolExecutor.execute(() -> businessEventListener.handleBusinessEventWithoutReturn(event));
        }
    }

}
