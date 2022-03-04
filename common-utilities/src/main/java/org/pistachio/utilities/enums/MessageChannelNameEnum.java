package org.pistachio.utilities.enums;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 * 消息队列通道名枚举类
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2019/6/12 ~ 下午 6:22
 */

public enum MessageChannelNameEnum {

    /**
     * 物流消息通道
     */
    LOGISTIC_MESSAGE_OUTPUT_CHANNEL("LogisticMessageOutputChannel"),

    /**
     * 商品消息通道
     */
    MERCHANDISE_OUTPUT_CHANNEL("MerchandiseOutputChannel"),

    /**
     * 订单消息通道
     */
    MESSAGE_CHANNEL_NAME_ENUM("OrderMessageOutputChannel");

    private final String name;

    MessageChannelNameEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
