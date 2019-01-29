package org.pistachio.producer;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 * 商品消息发送通道
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2019/1/13 ~ 上午 12:29
 */

public interface MerchandiseMessageOutputChannel {

    String MERCHANDISE_OUTPUT_CHANNEL = "MERCHANDISE_OUTPUT_CHANNEL";

    /**
     * 商品消息发送通道
     *
     * @return MessageChannel，消息通道
     */
    @Output(value = MerchandiseMessageOutputChannel.MERCHANDISE_OUTPUT_CHANNEL)
    MessageChannel getMerchandiseOutputChannel();
}
