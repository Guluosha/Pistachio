package org.pistachio.consumer.config;

import lombok.extern.slf4j.Slf4j;
import org.pistachio.consumer.channel.OrderMessageInputChannel;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2018/12/16 ~ 下午 11:21
 */

@Slf4j
@EnableBinding(value = {OrderMessageInputChannel.class})
public class MessageConsumerConfiguration {

	@StreamListener(target = OrderMessageInputChannel.ORDER_MESSAGE_INPUT_CHANNEL)
	private void receiveAndPrintMessage(String message) {
		log.info("receiveOrderMessage：####################\n");
		System.out.println(message);
	}
}
