package org.pistachio.utilities.enums;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2019/9/9 ~ 下午 11:04
 */

public enum ServiceNameEnum {

    /**
     * 活动服务
     */
    ACTIVITY("activity"),

    /**
     * 授权服务
     */
    AUTHORITY("authority"),

    /**
     * 对象存储服务
     */
    CLOUD("cloud"),

    /**
     * 员工服务
     */
    EMPLOYEE("employee"),

    /**
     * 库存服务
     */
    INVENTORY("inventory"),

    /**
     * 物流服务
     */
    LOGISTICS("logistics"),

    /**
     * 管理服务
     */
    MANAGER("manager"),

    /**
     * 商品服务
     */
    MERCHANDISE("merchandise"),

    /**
     * 店铺服务
     */
    MERCHANT("merchant"),

    /**
     * 订单服务
     */
    ORDER("order"),

    /**
     * 支付服务
     */
    PAY("pay"),

    /**
     * 积分服务
     */
    POINTS("points"),

    /**
     * 搜索服务
     */
    SEARCH("search"),

    /**
     * 用户服务
     */
    USER("user");

    private String serviceName;

    ServiceNameEnum(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceName() {
        return serviceName;
    }
}
