package org.pistachio.producer;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 * 订单消息发送通道
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2019/1/13 ~ 上午 12:22
 */

public interface OrderMessageOutputChannel {

    String ORDER_MESSAGE_OUTPUT_CHANNEL = "ORDER_MESSAGE_OUTPUT_CHANNEL";

    /**
     * 订单消息发送通道
     *
     * @return SubscribableChannel，消息订阅通道
     */
    @Output(value = OrderMessageOutputChannel.ORDER_MESSAGE_OUTPUT_CHANNEL)
    MessageChannel getOrderOutputChannel();

}
