package org.pistachio.utilities.chain;


import org.pistachio.utilities.listener.interfaces.BusinessEventListener;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2019/5/11 ~ 上午 2:00
 */

public interface BusinessEventHandlerChain {

    BusinessEventHandlerChain append(BusinessEventListener businessEventListener);

    BusinessEventHandlerChain remove(BusinessEventListener businessEventListener);

}
