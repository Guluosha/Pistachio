package org.pistachio.model.event.impl;

import org.pistachio.model.event.abstracts.AbstractBusinessVo;
import org.pistachio.model.event.abstracts.AbstractMerchandiseVoEvent;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2019/5/4 ~ 下午 6:16
 */

public class MerchandiseAuditVoEvent extends AbstractMerchandiseVoEvent {

    /**
     * Constructs a prototypical Event.
     *
     * @param businessVo The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public MerchandiseAuditVoEvent(AbstractBusinessVo businessVo) {
        super(businessVo);
    }

    /**
     * 获取事件名
     *
     * @return String，事件名
     */
    @Override
    protected String getCurrentEventName() {
        return this.getClass().getName();
    }
}
