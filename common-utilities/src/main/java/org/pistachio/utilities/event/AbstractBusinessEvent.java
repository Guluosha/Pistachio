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

    protected long timeStamp;

    protected AbstractBusinessEvent(Object source) {
        super(source);
        timeStamp = System.currentTimeMillis();
    }

    /**
     * 获取事件名
     *
     * @return String，事件名
     */
    protected String getEventName() {
        return this.getClass().getSimpleName();
    }

}
