package org.pistachio.utilities.event.concrete;

import org.pistachio.utilities.eventsource.base.AbstractBusinessEventSource;
import org.pistachio.utilities.event.inherits.AbstractMerchantEvent;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2019/5/11 ~ 下午 10:23
 */

public class MerchantAuditEvent extends AbstractMerchantEvent {

    /**
     * Constructs a prototypical Event.
     *
     * @param abstractBusinessEventSource The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public MerchantAuditEvent(AbstractBusinessEventSource abstractBusinessEventSource) {
        super(abstractBusinessEventSource);
    }

    /**
     * 获取事件名
     *
     * @return String，事件名
     */
    @Override
    public String getCurrentEventName() {
        return this.getClass().getName();
    }
}
