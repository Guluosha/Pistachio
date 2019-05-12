package org.pistachio.model.listener.impl;

import lombok.extern.slf4j.Slf4j;
import org.pistachio.model.event.abstracts.AbstractBusinessVoEvent;
import org.pistachio.model.event.impl.MerchandiseAuditVoEvent;
import org.pistachio.model.listener.interfaces.BusinessEventListener;
import org.pistachio.model.vo.MerchandiseAuditVo;
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
    public void handleBusinessEventWithoutReturn(AbstractBusinessVoEvent businessEvent) {
        MerchandiseAuditVoEvent merchandiseAuditVoEvent = (MerchandiseAuditVoEvent) businessEvent;
        MerchandiseAuditVo merchandiseAuditVo = (MerchandiseAuditVo) merchandiseAuditVoEvent.getSource();
        if (checkIfAllowedToHandle(merchandiseAuditVo)) {
            System.out.println(merchandiseAuditVo.getId() + merchandiseAuditVo.getName());
        }
    }

    /**
     * 处理业务事件并返回结果（泛型）
     *
     * @param businessEvent 业务事件
     * @return T，泛型
     */
    @Override
    public <T> T handleBusinessEvent(AbstractBusinessVoEvent businessEvent) {
        return null;
    }

    private Boolean checkIfAllowedToHandle(MerchandiseAuditVo merchandiseAuditVo) {
        return true;
    }
}
