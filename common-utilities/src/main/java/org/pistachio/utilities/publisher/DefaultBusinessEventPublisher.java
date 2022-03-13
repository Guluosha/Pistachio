package org.pistachio.utilities.publisher;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;
import lombok.extern.slf4j.Slf4j;
import org.pistachio.utilities.publisher.base.AbstractBusinessEventPublisher;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2019/5/5 ~ 上午 10:12
 */


@Slf4j
@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
public class DefaultBusinessEventPublisher extends AbstractBusinessEventPublisher {

}
