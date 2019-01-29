package org.pistachio.producer;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2019/1/13 ~ 上午 1:19
 */

public interface LogisticsMessageOutputChannel {

    String LOGISTIC_MESSAGE_OUTPUT_CHANNEL = "LOGISTIC_MESSAGE_OUTPUT_CHANNEL";

    /**
     * 物流消息发送通道
     *
     * @return MessageChannel，消息发送通道
     */
    @Output(value = LogisticsMessageOutputChannel.LOGISTIC_MESSAGE_OUTPUT_CHANNEL)
    MessageChannel getLogisticOutputChannel();
}
