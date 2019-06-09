package org.pistachio.merchandise.event;

import org.pistachio.utilities.event.AbstractBusinessEvent;
import org.pistachio.utilities.event.AbstractBusinessEventSource;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2019/5/4 ~ 下午 6:16
 */

public class MerchandiseAuditEvent extends AbstractBusinessEvent {

    /**
     * Constructs a prototypical Event.
     *
     * @param abstractBusinessEventSource The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public MerchandiseAuditEvent(AbstractBusinessEventSource abstractBusinessEventSource) {
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
