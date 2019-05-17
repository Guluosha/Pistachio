package org.pistachio.utilities.eventsource;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.pistachio.utilities.eventsource.base.AbstractBusinessEventSource;
import org.springframework.stereotype.Component;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2019/5/13 ~ 上午 12:52
 */

@Slf4j
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Component
public class MerchantAuditEventSource extends AbstractBusinessEventSource {

    private Long id;

    private String merchantName;
}
