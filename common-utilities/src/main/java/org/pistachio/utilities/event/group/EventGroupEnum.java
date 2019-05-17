package org.pistachio.utilities.event.group;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 * 事件组枚举
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2019/5/9 ~ 下午 6:22
 */

public enum EventGroupEnum {

    /**
     * 活动组
     */
    ACTIVITY_GROUP("ActivityGroup", 0),

    /**
     * 认证组
     */
    AUTHORITY_GROUP("AuthorityGroup", 1),

    /**
     * 云服务组
     */
    CLOUD_GROUP("CloudGroup", 2),

    /**
     * 商品组
     */
    MERCHANDISE_GROUP("MerchandiseGroup", 3),

    /**
     * 店铺组
     */
    MERCHANT_GROUP("MerchantGroup", 4);

    private String eventGroupName;

    private Integer eventGroupNumber;

    EventGroupEnum(String eventGroupName, Integer eventGroupNumber) {
        this.eventGroupName = eventGroupName;
        this.eventGroupNumber = eventGroupNumber;
    }

    public String getEventGroupName() {
        return eventGroupName;
    }

    public Integer getEventGroupNumber() {
        return eventGroupNumber;
    }

    public static EventGroupEnum getEventGroupEnumByNameOrNumber(String eventGroupName, Integer eventGroupNumber) {
        for (EventGroupEnum eventGroupEnum : values()) {
            if (eventGroupEnum.getEventGroupName().equalsIgnoreCase(eventGroupName) || eventGroupEnum.getEventGroupNumber().equals(eventGroupNumber)) {
                return eventGroupEnum;
            }
        }
        return null;
    }
}
