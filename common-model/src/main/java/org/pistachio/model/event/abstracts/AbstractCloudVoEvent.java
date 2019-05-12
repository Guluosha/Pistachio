package org.pistachio.model.event.abstracts;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2019/5/4 ~ 下午 6:15
 */

public abstract class AbstractCloudVoEvent extends AbstractBusinessVoEvent {

    /**
     * Constructs a prototypical Event.
     *
     * @param businessVo The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public AbstractCloudVoEvent(AbstractBusinessVo businessVo) {
        super(businessVo);
    }
}
