package org.pistachio.utilities.enums.constants;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2019/7/29 ~ 上午 1:12
 */

public enum SeparatorEnums {

    /**
     * URL分隔符
     */
    URL_SEPARATOR("/");

    private String string;

    SeparatorEnums(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }
}
