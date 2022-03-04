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

public abstract class AbstractBusinessEvent<T> extends EventObject {

    private final long timeStamp;

    protected AbstractBusinessEvent(T source) {
        super(source);
        this.timeStamp = System.currentTimeMillis();
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    /**
     * 获取事件名
     *
     * @return String，事件名
     */
    protected abstract String getEventName();

}
