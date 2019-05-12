package org.pistachio.model.event.abstracts;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2019/5/4 ~ 下午 5:58
 */

public abstract class AbstractMerchandiseVoEvent extends AbstractBusinessVoEvent {

    /**
     * Constructs a prototypical Event.
     *
     * @param businessVo The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public AbstractMerchandiseVoEvent(AbstractBusinessVo businessVo) {
        super(businessVo);
    }
}
