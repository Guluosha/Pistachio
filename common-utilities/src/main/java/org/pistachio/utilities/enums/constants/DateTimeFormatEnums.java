package org.pistachio.utilities.enums.constants;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2019/6/30 ~ 下午 3:25
 */

public enum DateTimeFormatEnums {

    /**
     * “年-月-日”
     */
    YYYY_MM_DD("yyyy-MM-dd"),

    /**
     * “时-分-秒”
     */
    HH_MM_SS("HH:mm:ss"),

    /**
     * “年-月-日 时-分-秒”
     */
    YYYY_MM_DD_HH_MM_SS("yyyy-MM-dd HH:mm:ss"),

    /**
     * “年-月-日 时-分-秒-毫秒”
     */
    YYYY_MM_DD_HH_MM_SS_SSS("yyyy-MM-dd HH:mm:ss:SSS");

    private String format;

    DateTimeFormatEnums(String format) {
        this.format = format;
    }

    public String getFormat() {
        return format;
    }
}
