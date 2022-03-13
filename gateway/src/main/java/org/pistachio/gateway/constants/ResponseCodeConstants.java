package org.pistachio.gateway.constants;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @version 1.0.0
 * @date 2021/05/04 ~ 下午 4:14
 */

public interface ResponseCodeConstants {

    /**
     * 200范围
     */
    String OK = "200";

    /**
     * 300范围
     */
    String REDIRECT = "302";

    /**
     * 400范围
     */
    String BAD_REQUEST = "400";
    String UN_AUTHORIZED = "401";
    String UN_AUTHENTICATION = "403";
    String NOT_FOUND = "404";

}
