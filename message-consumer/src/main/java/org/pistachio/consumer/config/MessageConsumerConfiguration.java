package org.pistachio.consumer.config;

import lombok.extern.slf4j.Slf4j;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2018/12/16 ~ 下午 11:21
 */

@Slf4j
public class MessageConsumerConfiguration {

    private void receiveAndPrintMessage(String message) {
        log.info("receiveOrderMessage：####################\n");
        System.out.println(message);
    }
}
