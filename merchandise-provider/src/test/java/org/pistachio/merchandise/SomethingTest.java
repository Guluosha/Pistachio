package org.pistachio.merchandise;

import java.math.BigDecimal;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2019/6/20 ~ 下午 2:46
 */

public class SomethingTest {

    public static void main(String[] args) {
        float vara = 1.0f - 0.9f;
        float varb = 0.9f - 0.8f;
        String nullString = null;
        switch (nullString) {
            case "null":
                System.out.println("null");
                break;
            default:
                System.out.println("default");
        }
        BigDecimal bigDecimal = new BigDecimal(0.1);
        BigDecimal bigDecimal1 = new BigDecimal("0.1");
        Float aFloatA = Float.valueOf(1.0f - 0.9f);
        Float aFloatB = Float.valueOf(0.9f - 0.8f);
        System.out.println(aFloatA.equals(aFloatB));
        System.out.println(vara);
        System.out.println(varb);
    }
}
