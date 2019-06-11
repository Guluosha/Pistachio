package org.pistachio.merchandise.listener;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.pistachio.merchandise.event.MerchandiseAuditEvent;
import org.pistachio.merchandise.eventsource.MerchandiseAuditEventSource;
import org.pistachio.utilities.event.AbstractBusinessEvent;
import org.pistachio.utilities.listener.BusinessEventListener;
import org.springframework.stereotype.Component;

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
@Component
public class MerchandiseAuditEventListener implements BusinessEventListener {

    /**
     * 处理业务事件
     *
     * @param businessEvent 业务事件
     */
    @Override
    public void handleBusinessEventWithoutReturn(AbstractBusinessEvent businessEvent) {
        MerchandiseAuditEvent merchandiseAuditVoEvent = (MerchandiseAuditEvent) businessEvent;
        Object merchandiseAuditVo = merchandiseAuditVoEvent.getSource();
        if (merchandiseAuditVo instanceof MerchandiseAuditEventSource) {
            System.out.println("\n\n##################################\n以下是商品审核事件监听器输出：\n");
            System.out.println("id为：" + ((MerchandiseAuditEventSource) merchandiseAuditVo).getId());
            System.out.println("商品名称为：" + ((MerchandiseAuditEventSource) merchandiseAuditVo).getMerchandiseName());
            System.out.println("\n##################################\n\n");
        }
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
