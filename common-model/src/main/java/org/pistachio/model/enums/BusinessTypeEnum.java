package org.pistachio.model.enums;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 * 业务枚举类
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2019/5/3 ~ 下午 11:57
 */

public enum BusinessTypeEnum {

    /**
     * 活动业务
     */
    ACTIVITY_BUSINESS(1),

    /**
     * 授权业务
     */
    AUTHORITY_BUSINESS(2),

    /**
     * 云服务业务
     */
    CLOUD_BUSINESS(3),

    /**
     * 员工业务
     */
    EMPLOYEE_BUSINESS(4),

    /**
     * 库存业务
     */
    INVENTORY_BUSINESS(5),

    /**
     * 物流业务
     */
    LOGISTICS_BUSINESS(6),

    /**
     * 管理业务
     */
    MANAGER_BUSINESS(7),

    /**
     * 商品业务
     */
    MERCHANDISE_BUSINESS(8),

    /**
     * 店铺业务
     */
    MERCHANT_BUSINESS(9),

    /**
     * 消息业务
     */
    MESSAGE_BUSINESS(10),

    /**
     * 订单业务
     */
    ORDER_BUSINESS(11),

    /**
     * 积分业务
     */
    POINTS_BUSINESS(12),

    /**
     * 搜索业务
     */
    SEARCH_BUSINESS(13),

    /**
     * 神策统计业务
     */
    SENSORS_BUSINESS(14),

    /**
     * 用户业务
     */
    USER_BUSINESS(15);

    private Integer businessTypeSerialNumber;

    BusinessTypeEnum(Integer businessTypeSerialNumber) {
        this.businessTypeSerialNumber = businessTypeSerialNumber;
    }

    public Integer getBusinessTypeSerialNumber() {
        return businessTypeSerialNumber;
    }

    /**
     * 根据业务类型值获取业务类型枚举值
     *
     * @param businessTypeSerialNumber 请求参数
     * @return BusinessTypeEnum，业务类型枚举
     */
    public static BusinessTypeEnum getBusinessTypeEnumBySerialNumber(Integer businessTypeSerialNumber) {
        if (businessTypeSerialNumber != null) {
            for (BusinessTypeEnum businessTypeEnum : values()) {
                if (businessTypeEnum.businessTypeSerialNumber.equals(businessTypeSerialNumber)) {
                    return businessTypeEnum;
                }
            }
            return null;
        } else {
            return null;
        }
    }
}
