package org.pistachio.utilities.listener;

import org.pistachio.utilities.event.base.AbstractBusinessEvent;

import java.util.EventListener;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2019/5/4 ~ 下午 11:05
 */

public interface BusinessEventListener extends EventListener {

    /**
     * 处理业务事件
     *
     * @param businessEvent 业务事件
     */
    void handleBusinessEventWithoutReturn(AbstractBusinessEvent businessEvent);

    /**
     * 处理业务事件并返回结果（泛型）
     *
     * @param businessEvent 业务事件
     * @param <T>           结果（泛型）
     * @return T，泛型
     */
    <T> T handleBusinessEvent(AbstractBusinessEvent businessEvent);

}
