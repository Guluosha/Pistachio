package org.pistachio.utilities.listener.impl;

import lombok.extern.slf4j.Slf4j;
import org.pistachio.utilities.event.base.AbstractBusinessEvent;
import org.pistachio.utilities.event.concrete.MerchantAuditEvent;
import org.pistachio.utilities.listener.interfaces.BusinessEventListener;
import org.pistachio.utilities.eventsource.MerchantAuditEventSource;
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
public class MerchantAuditEventListener implements BusinessEventListener {

    /**
     * 处理业务事件
     *
     * @param businessEvent 业务事件
     */
    @Override
    public void handleBusinessEventWithoutReturn(AbstractBusinessEvent businessEvent) {
        MerchantAuditEvent merchantAuditVoEvent = (MerchantAuditEvent) businessEvent;
        Object merchantAuditVo = merchantAuditVoEvent.getSource();
        if (merchantAuditVo instanceof MerchantAuditEventSource) {
            System.out.println("\n\n##################################\n以下是店铺审核时间监听器输出：\n");
            System.out.println("id为：" + ((MerchantAuditEventSource) merchantAuditVo).getId());
            System.out.println("店铺名为：" + ((MerchantAuditEventSource) merchantAuditVo).getMerchantName());
            System.out.println("\n##################################\n\n");
        }
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
