package org.pistachio.merchandise.listener;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.pistachio.utilities.event.base.AbstractBusinessEvent;
import org.pistachio.utilities.listener.BusinessEventListener;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2019/5/31 ~ 下午 6:48
 */

@Data
@Builder
@AllArgsConstructor
public class MerchandiseAuditEventListener implements BusinessEventListener {

    /**
     * 处理业务事件
     *
     * @param businessEvent 业务事件
     */
    @Override
    public void handleBusinessEventWithoutReturn(AbstractBusinessEvent businessEvent) {

    }

    /**
     * 处理业务事件并返回结果（泛型）
     *
     * @param businessEvent 业务事件
     * @return T，泛型
     */
    @Override
    public <T> T handleBusinessEvent(AbstractBusinessEvent businessEvent) {
        return null;
    }
}
