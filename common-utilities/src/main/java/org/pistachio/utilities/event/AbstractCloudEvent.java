package org.pistachio.utilities.event;

import org.pistachio.utilities.event.base.AbstractBusinessEvent;
import org.pistachio.utilities.event.base.AbstractBusinessEventSource;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2019/5/4 ~ 下午 6:15
 */

public abstract class AbstractCloudEvent extends AbstractBusinessEvent {

    /**
     * Constructs a prototypical Event.
     *
     * @param abstractBusinessEventSource The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public AbstractCloudEvent(AbstractBusinessEventSource abstractBusinessEventSource) {
        super(abstractBusinessEventSource);
    }
}
