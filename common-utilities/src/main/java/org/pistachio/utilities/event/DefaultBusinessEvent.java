package org.pistachio.utilities.event;

import lombok.extern.slf4j.Slf4j;

/**
 * CopyRight (C),深圳市壹账通智能科技有限公司
 * <br/><b/>
 *
 * @author SingleCycle
 * @version 1.0.0
 * @date 2022/03/12 ~ 上午 1:10
 * @since 1.0.0
 */


@Slf4j
public class DefaultBusinessEvent extends AbstractBusinessEvent {

    /**
     * 构造器
     *
     * @param eventContent 事件内容
     */
    protected DefaultBusinessEvent(String eventContent) {
        super(eventContent);
    }

    /**
     * 获取事件名
     *
     * @return String，事件名
     */
    @Override
    protected String getEventName() {
        return DefaultBusinessEvent.class.getName();
    }
}
