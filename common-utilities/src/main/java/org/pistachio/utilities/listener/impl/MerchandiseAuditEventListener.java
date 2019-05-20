package org.pistachio.utilities.listener.impl;

import lombok.extern.slf4j.Slf4j;
import org.pistachio.utilities.event.base.AbstractBusinessEvent;
import org.pistachio.utilities.event.concrete.MerchandiseAuditEvent;
import org.pistachio.utilities.listener.interfaces.BusinessEventListener;
import org.pistachio.utilities.eventsource.MerchandiseAuditEventSource;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2019/5/4 ~ 下午 11:14
 */

@Slf4j
@Component
@Scope(scopeName = "singleton")
@Lazy(value = false)
public class MerchandiseAuditEventListener implements BusinessEventListener {

    /**
     * 处理业务事件
     *
     * @param businessEvent 业务事件
     */
    @Override
    public void handleBusinessEventWithoutReturn(AbstractBusinessEvent businessEvent) {
        MerchandiseAuditEvent merchandiseAuditVoEvent = (MerchandiseAuditEvent) businessEvent;
        Object merchandiseAuditVo = merchandiseAuditVoEvent.getSource();
        if (merchandiseAuditVo instanceof MerchandiseAuditEventSource) {
            System.out.println("\n\n##################################\n以下是商品审核时间监听器输出：\n");
            System.out.println("id为：" + ((MerchandiseAuditEventSource) merchandiseAuditVo).getId());
            System.out.println("商品名称为：" + ((MerchandiseAuditEventSource) merchandiseAuditVo).getMerchandiseName());
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

    private Boolean checkIfAllowedToHandle(Object merchandiseAuditVo) {
        return merchandiseAuditVo instanceof MerchandiseAuditEventSource;
    }
}
