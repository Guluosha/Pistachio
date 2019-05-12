package org.pistachio.model.publisher;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.pistachio.model.event.abstracts.AbstractBusinessVoEvent;
import org.pistachio.model.listener.interfaces.BusinessEventListener;
import org.pistachio.model.listener.interfaces.ExceptionHandler;
import org.pistachio.model.publisher.base.BusinessEventPublisher;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2019/5/5 ~ 上午 10:12
 */

@Slf4j
@Component
@Lazy(value = false)
@Scope(scopeName = "singleton")
public class DefaultBusinessEventPublisher implements BusinessEventPublisher {

    private Set<BusinessEventListener> businessEventListenerSet = Collections.emptySet();

    @Getter
    @Setter
    private ExceptionHandler exceptionHandler;

    @Resource
    private ThreadPoolExecutor threadPoolExecutor;

    /**
     * 添加事件监听器
     *
     * @param listener 监听器
     */
    @Override
    public void addEventListener(BusinessEventListener listener) {
        if (!businessEventListenerSet.contains(listener)) {
            businessEventListenerSet.add(listener);
        }
    }

    /**
     * 移除事件监听器
     *
     * @param listener 监听器
     */
    @Override
    public void removeEventListener(BusinessEventListener listener) {
        if (businessEventListenerSet.contains(listener)) {
            businessEventListenerSet.remove(listener);
        }
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
    public void publishEvent(AbstractBusinessVoEvent event) {
        for (BusinessEventListener businessEventListener : businessEventListenerSet) {
            threadPoolExecutor.execute(() -> businessEventListener.handleBusinessEventWithoutReturn(event));
        }
    }

}
