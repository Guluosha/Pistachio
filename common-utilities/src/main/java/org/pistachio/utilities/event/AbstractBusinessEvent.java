package org.pistachio.utilities.event;

import lombok.extern.slf4j.Slf4j;

import java.util.EventObject;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 * 业务事件模型基类
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2019/5/3 ~ 下午 11:58
 */

@Slf4j
public abstract class AbstractBusinessEvent extends EventObject {

    /**
     * 事件创建时的时间戳
     */
    private final long timeStamp;

    /**
     * 构造器
     *
     * @param eventContent 事件内容
     */
    protected AbstractBusinessEvent(Object eventContent) {
        super(eventContent);
        timeStamp = System.currentTimeMillis();
    }

    protected long getTimeStamp() {
        return timeStamp;
    }

    /**
     * 获取事件名
     *
     * @return String，事件名
     */
    public abstract String getEventName();

}
