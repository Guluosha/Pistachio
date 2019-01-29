package org.pistachio.consumer.channel;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2019/1/13 ~ 下午 3:34
 */

public interface MerchandiseMessageInputChannel {

    String MERCHANDISE_MESSAGE_INPUT_CHANNEL = "MERCHANDISE_MESSAGE_INPUT_CHANNEL";

    /**
     * 获取商品消息订阅通道
     *
     * @return SubscribableChannel，消息订阅通道
     */
    @Input(value = MerchandiseMessageInputChannel.MERCHANDISE_MESSAGE_INPUT_CHANNEL)
    SubscribableChannel getMerchandiseMessageInputChannel();
}
