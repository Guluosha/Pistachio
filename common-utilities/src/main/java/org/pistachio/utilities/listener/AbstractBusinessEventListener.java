package org.pistachio.utilities.listener;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.pistachio.utilities.event.AbstractBusinessEvent;
import org.pistachio.utilities.exception.AbstractBusinessException;
import org.pistachio.utilities.exception.AbstractBusinessRuntimeException;

import java.util.Objects;

/**
 * CopyRight (C),深圳市壹账通智能科技有限公司
 * <br/><b/>
 *
 * @author SingleCycle
 * @version 1.0.0
 * @date 2022/03/12 ~ 下午 10:40
 * @since 1.0.0
 */

@Slf4j
@Data
public abstract class AbstractBusinessEventListener implements BusinessEventListener<AbstractBusinessEvent> {

    /**
     * 获取事件监听器名
     *
     * @return {@link String}，事件监听器名
     */
    protected abstract String getBusinessEventListenerName();

    /**
     * 处理业务事件
     *
     * @param businessEvent 业务事件
     * @throws AbstractBusinessException        业务异常基类
     * @throws AbstractBusinessRuntimeException 运行时业务异常基类
     */
    @Override
    public void onBusinessEvent(AbstractBusinessEvent businessEvent)
            throws AbstractBusinessException, AbstractBusinessRuntimeException {
        Objects.requireNonNull(businessEvent, "业务事件为空!");
        Objects.requireNonNull(businessEvent.getSource(), "业务事件内容为空!");
        log.warn("业务事件监听器基类，不处理任务事件");
    }
}
