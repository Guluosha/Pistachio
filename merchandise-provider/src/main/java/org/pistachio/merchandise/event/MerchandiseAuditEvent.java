package org.pistachio.merchandise.event;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.pistachio.merchandise.event.base.AbstractMerchandiseEvent;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2019/5/4 ~ 下午 6:16
 */

@Slf4j
public class MerchandiseAuditEvent extends AbstractMerchandiseEvent {

    @Getter
    @Setter
    private Long id;

    public MerchandiseAuditEvent(String eventContent) {
        super(eventContent);
    }

    @Override
    protected String getEventName() {
        return "商品-审核事件";
    }

}
