package org.pistachio.producer;

import org.springframework.cloud.stream.messaging.Source;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2019/6/12 ~ 下午 6:18
 */

public interface OutputMessageChannel extends Source {

    String LOGISTIC_MESSAGE_OUTPUT_CHANNEL = "Logistic_Message_Output_Channel";

    String MERCHANDISE_OUTPUT_CHANNEL = "MERCHANDISE_OUTPUT_CHANNEL";

    String ORDER_MESSAGE_OUTPUT_CHANNEL = "ORDER_MESSAGE_OUTPUT_CHANNEL";
}
