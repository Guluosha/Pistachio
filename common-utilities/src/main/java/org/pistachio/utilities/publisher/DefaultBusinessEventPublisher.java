package org.pistachio.utilities.publisher;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.pistachio.utilities.event.base.AbstractBusinessEvent;
import org.pistachio.utilities.listener.BusinessEventListener;
import org.pistachio.utilities.listener.ExceptionHandler;
import org.pistachio.utilities.publisher.base.BusinessEventPublisher;

import java.util.Set;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2019/5/5 ~ 上午 10:12
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DefaultBusinessEventPublisher implements BusinessEventPublisher {

    @Getter
    @Setter
    private Set<BusinessEventListener> businessEventListenerSet;

    @Getter
    @Setter
    private ExceptionHandler exceptionHandler;

    @Getter
    @Setter
    private ThreadPoolExecutor threadPoolExecutor;

    /**
     * 添加事件监听器
     *
     * @param listener 监听器
     */
    @Override
    public void registerEventListener(BusinessEventListener listener) {
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
    public void publishEvent(AbstractBusinessEvent event) {
        for (BusinessEventListener businessEventListener : businessEventListenerSet) {
            threadPoolExecutor.execute(() -> businessEventListener.handleBusinessEventWithoutReturn(event));
        }
    }

}
