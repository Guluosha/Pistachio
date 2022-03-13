package org.pistachio.merchandise.listener;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.extern.slf4j.Slf4j;
import org.pistachio.merchandise.listener.base.AbstractMerchandiseBusinessEventListener;
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
}
