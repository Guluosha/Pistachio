package org.pistachio.merchandise.listener;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.extern.slf4j.Slf4j;
import org.pistachio.merchandise.event.MerchandiseAuditEvent;
import org.pistachio.merchandise.listener.base.AbstractMerchandiseBusinessEventListener;
import org.pistachio.utilities.event.AbstractBusinessEvent;
import org.pistachio.utilities.exception.AbstractBusinessException;
import org.pistachio.utilities.exception.AbstractBusinessRuntimeException;
import org.springframework.stereotype.Component;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2019/5/31 ~ 下午 6:48
 */

@EqualsAndHashCode(callSuper = true)
@Slf4j
@Data
@Component
public class MerchandiseAuditEventListener extends AbstractMerchandiseBusinessEventListener {

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
        if (!(businessEvent instanceof MerchandiseAuditEvent)) {
            return;
        }
        String merchandiseName = (String) businessEvent.getSource();
        log.info("审核的商品名：{}", merchandiseName);
    }
}
