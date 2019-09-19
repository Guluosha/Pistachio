package org.pistachio.merchandise.eventsource;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.pistachio.utilities.event.AbstractBusinessEventSource;
import org.springframework.stereotype.Component;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2019/5/12 ~ 下午 8:34
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Component
public class MerchandiseAuditEventSource extends AbstractBusinessEventSource {

    private Long id;

    private String merchandiseName;

    @Override
    public AbstractBusinessEventSource setData(Object data) {
        return super.setData(data);
    }
}

