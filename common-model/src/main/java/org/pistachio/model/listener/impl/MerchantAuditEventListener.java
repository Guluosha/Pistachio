package org.pistachio.model.listener.impl;

import lombok.extern.slf4j.Slf4j;
import org.pistachio.model.event.impl.MerchantAuditVoEvent;
import org.pistachio.model.listener.interfaces.BusinessEventListener;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2019/5/12 ~ 下午 6:40
 */

@Slf4j
@Component
@Scope(scopeName = "singleton")
public class MerchantAuditEventListener implements BusinessEventListener<MerchantAuditVoEvent> {

    /**
     * 处理业务事件
     *
     * @param businessEvent 业务事件
     */
    @Override
    public void handleBusinessEventWithoutReturn(MerchantAuditVoEvent businessEvent) {

    }

    /**
     * 处理业务事件并返回结果（泛型）
     *
     * @param businessEvent 业务事件
     * @return T，泛型
     */
    @Override
    public <T> T handleBusinessEvent(MerchantAuditVoEvent businessEvent) {
        return null;
    }
}
