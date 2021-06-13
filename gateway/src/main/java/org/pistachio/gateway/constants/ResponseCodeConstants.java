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
    int OK = 200;

    /**
     * 300范围
     */
    int REDIRECT = 302;

    /**
     * 400范围
     */
    int BAD_REQUEST = 400;
    int UN_AUTHORIZED = 401;
    int UN_AUTHENTICATION = 403;
    int NOT_FOUND = 404;

}
