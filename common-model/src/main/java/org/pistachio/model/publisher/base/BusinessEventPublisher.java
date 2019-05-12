package org.pistachio.model.publisher.base;

import org.pistachio.model.event.abstracts.AbstractBusinessVoEvent;
import org.pistachio.model.listener.interfaces.BusinessEventListener;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2019/5/5 ~ 上午 12:09
 */

public interface BusinessEventPublisher {

    /**
     * 添加事件监听器
     *
     * @param listener 监听器
     */
    void addEventListener(BusinessEventListener listener);

    /**
     * 移除事件监听器
     *
     * @param listener 监听器
     */
    void removeEventListener(BusinessEventListener listener);

    /**
     * 移除所有事件监听器
     */
    void removeAllEventListener();

    /**
     * 发布事件
     *
     * @param event 事件
     */
    void publishEvent(AbstractBusinessVoEvent event);
}
