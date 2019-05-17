package org.pistachio.utilities.listener.impl;

import lombok.extern.slf4j.Slf4j;
import org.pistachio.utilities.event.base.AbstractBusinessEvent;
import org.pistachio.utilities.listener.interfaces.BusinessEventListener;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2019/5/13 ~ 上午 12:48
 */

@Slf4j
@Component
@Scope(scopeName = "singleton")
public class MerchantUpdateEventListener implements BusinessEventListener {

    /**
     * 处理业务事件
     *
     * @param businessEvent 业务事件
     */
    @Override
    public void handleBusinessEventWithoutReturn(AbstractBusinessEvent businessEvent) {

    }

    /**
     * 处理业务事件并返回结果（泛型）
     *
     * @param businessEvent 业务事件
     * @return T，泛型
     */
    @Override
    public <T> T handleBusinessEvent(AbstractBusinessEvent businessEvent) {
        return null;
    }
}
