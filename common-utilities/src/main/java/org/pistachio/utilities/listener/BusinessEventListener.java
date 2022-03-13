package org.pistachio.utilities.listener;

import org.pistachio.utilities.event.AbstractBusinessEvent;
import org.pistachio.utilities.exception.AbstractBusinessException;
import org.pistachio.utilities.exception.AbstractBusinessRuntimeException;

import java.util.EventListener;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 * 业务事件监听器
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2019/5/4 ~ 下午 11:05
 */

public interface BusinessEventListener<E extends AbstractBusinessEvent> extends EventListener {

    /**
     * 处理业务事件
     *
     * @param businessEvent 业务事件
     * @throws AbstractBusinessException        业务异常基类
     * @throws AbstractBusinessRuntimeException 运行时业务异常基类
     */
    void onBusinessEvent(E businessEvent) throws AbstractBusinessException, AbstractBusinessRuntimeException;

}
