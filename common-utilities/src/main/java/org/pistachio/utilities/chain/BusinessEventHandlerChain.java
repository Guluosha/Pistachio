package org.pistachio.utilities.chain;


import org.pistachio.utilities.listener.BusinessEventListener;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2019/5/11 ~ 上午 2:00
 */

public interface BusinessEventHandlerChain {

    /**
     * 追加业务事件监听器
     *
     * @param businessEventListener 业务事件监听器
     * @return BusinessEventHandlerChain 监听器链
     */
    BusinessEventHandlerChain append(BusinessEventListener businessEventListener);

    /**
     * 移除业务事件监听器
     *
     * @param businessEventListener 业务事件监听器
     * @return BusinessEventHandlerChain 监听器链
     */
    BusinessEventHandlerChain remove(BusinessEventListener businessEventListener);

}
