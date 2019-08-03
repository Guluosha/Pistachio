package org.pistachio.utilities.event;

import java.util.EventObject;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 * 业务事件模型基类
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2019/5/3 ~ 下午 11:58
 */

public abstract class AbstractBusinessEvent extends EventObject {

    private Integer status;

    /**
     * Constructs a prototypical Event.
     *
     * @param abstractBusinessEventSource The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public AbstractBusinessEvent(AbstractBusinessEventSource abstractBusinessEventSource) {
        super(abstractBusinessEventSource);
    }

    /**
     * 获取事件名
     *
     * @return String，事件名
     */
    public abstract String getCurrentEventName();

    public Integer getStatus() {
        return status;
    }

    public AbstractBusinessEvent setStatus(Integer status) {
        this.status = status;
        return this;
    }
}
