package org.pistachio.utilities.listener;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.extern.slf4j.Slf4j;
import org.pistachio.utilities.event.AbstractBusinessEvent;
import org.pistachio.utilities.event.DefaultBusinessEvent;
import org.pistachio.utilities.exception.AbstractBusinessException;
import org.pistachio.utilities.exception.AbstractBusinessRuntimeException;
import org.springframework.stereotype.Component;

import java.util.Objects;

/**
 * CopyRight (C),深圳市壹账通智能科技有限公司
 * <br/><b/>
 *
 * @author SingleCycle
 * @version 1.0.0
 * @date 2022/03/12 ~ 上午 11:59
 * @since 1.0.0
 */

@EqualsAndHashCode(callSuper = true)
@Slf4j
@Data
@Component
public class DefaultBusinessEventListener extends AbstractBusinessEventListener {

    /**
     * 获取事件监听器名
     *
     * @return {@link String}，事件监听器名
     */
    @Override
    protected String getBusinessEventListenerName() {
        return this.getClass().getName();
    }

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
        Objects.requireNonNull(businessEvent, "默认事件为空!");
        Objects.requireNonNull(businessEvent.getSource(), "默认事件内容为空!");
        if (!(businessEvent instanceof DefaultBusinessEvent)) {
            return;
        }
        log.info("监听到默认事件");
    }
}
