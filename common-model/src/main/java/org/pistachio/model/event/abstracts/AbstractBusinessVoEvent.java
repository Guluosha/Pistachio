package org.pistachio.model.event.abstracts;

import java.util.EventObject;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 * 业务事件模型基类
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2019/5/3 ~ 下午 11:58
 */

public abstract class AbstractBusinessVoEvent extends EventObject {

    /**
     * Constructs a prototypical Event.
     *
     * @param businessVo The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public AbstractBusinessVoEvent(AbstractBusinessVo businessVo) {
        super(businessVo);
    }

    /**
     * 获取事件名
     *
     * @return String，事件名
     */
    protected abstract String getCurrentEventName();

}
