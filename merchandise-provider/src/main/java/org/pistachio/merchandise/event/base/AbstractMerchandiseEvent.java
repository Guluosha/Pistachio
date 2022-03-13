package org.pistachio.merchandise.event.base;

import lombok.extern.slf4j.Slf4j;
import org.pistachio.utilities.event.AbstractBusinessEvent;

/**
 * CopyRight (C),深圳市壹账通智能科技有限公司
 * <br/><b/>
 *
 * @author SingleCycle
 * @version 1.0.0
 * @date 2022/03/12 ~ 下午 11:26
 * @since 1.0.0
 */

@Slf4j
public abstract class AbstractMerchandiseEvent extends AbstractBusinessEvent {

    /**
     * 构造器
     *
     * @param eventContent 事件内容
     */
    protected AbstractMerchandiseEvent(Object eventContent) {
        super(eventContent);
    }
}
