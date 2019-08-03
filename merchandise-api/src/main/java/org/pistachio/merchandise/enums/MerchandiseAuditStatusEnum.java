package org.pistachio.merchandise.enums;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2019/5/31 ~ 下午 6:06
 */

public enum MerchandiseAuditStatusEnum {

    /**
     * 通过
     */
    PASS(1),

    /**
     * 审核中
     */
    WAITTING(2),

    /**
     * 拒绝
     */
    REFUSED(3);

    private Integer value;

    MerchandiseAuditStatusEnum(Integer value) {
        this.value = value;
    }
}
