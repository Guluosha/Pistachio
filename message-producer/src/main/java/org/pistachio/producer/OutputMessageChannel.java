package org.pistachio.producer;

import org.pistachio.utilities.enums.MessageChannelNameEnum;
import org.springframework.cloud.stream.messaging.Source;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2019/6/12 ~ 下午 6:18
 */

public interface OutputMessageChannel extends Source {

    String LOGISTIC_MESSAGE_OUTPUT_CHANNEL = MessageChannelNameEnum.LogisticMessageOutputChannel.getName();

    String MERCHANDISE_OUTPUT_CHANNEL = MessageChannelNameEnum.MerchandiseOutputChannel.getName();

    String ORDER_MESSAGE_OUTPUT_CHANNEL = MessageChannelNameEnum.OrderMessageOutputChannel.getName();
}
