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
    ;

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
