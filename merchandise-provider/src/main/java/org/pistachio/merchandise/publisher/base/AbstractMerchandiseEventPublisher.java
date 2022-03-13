package org.pistachio.merchandise.publisher.base;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;
import lombok.extern.slf4j.Slf4j;
import org.pistachio.utilities.publisher.base.AbstractBusinessEventPublisher;

/**
 * CopyRight (C),深圳市壹账通智能科技有限公司
 * <br/><b/>
 *
 * @author SingleCycle
 * @version 1.0.0
 * @date 2022/03/12 ~ 下午 11:36
 * @since 1.0.0
 */

@EqualsAndHashCode(callSuper = true)
@Slf4j
@Data
@SuperBuilder
public abstract class AbstractMerchandiseEventPublisher extends AbstractBusinessEventPublisher {

}
