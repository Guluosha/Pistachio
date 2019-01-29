package org.pistachio.consumer.channel;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2018/12/16 ~ 下午 11:23
 */

public interface OrderMessageInputChannel {

    String ORDER_MESSAGE_INPUT_CHANNEL = "ORDER_MESSAGE_INPUT_CHANNEL";

    /**
     * 获取订单消息订阅通道
     *
     * @return SubscribableChannel，消息订阅通道
     */
    @Input(value = OrderMessageInputChannel.ORDER_MESSAGE_INPUT_CHANNEL)
    SubscribableChannel getOrderMessageInputChannel();

}
