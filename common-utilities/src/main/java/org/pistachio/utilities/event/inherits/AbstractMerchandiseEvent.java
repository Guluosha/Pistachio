package org.pistachio.utilities.event.inherits;

import org.pistachio.utilities.event.base.AbstractBusinessEvent;
import org.pistachio.utilities.eventsource.base.AbstractBusinessEventSource;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2019/5/4 ~ 下午 5:58
 */

public abstract class AbstractMerchandiseEvent extends AbstractBusinessEvent {

    /**
     * Constructs a prototypical Event.
     *
     * @param abstractBusinessEventSource The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public AbstractMerchandiseEvent(AbstractBusinessEventSource abstractBusinessEventSource) {
        super(abstractBusinessEventSource);
    }
}
