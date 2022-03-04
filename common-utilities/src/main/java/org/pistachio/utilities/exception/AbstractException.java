package org.pistachio.utilities.exception;

import com.netflix.zuul.exception.ZuulException;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 * 自定义异常消息包装类
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2019/3/23 ~ 上午 11:52
 */

public abstract class AbstractException extends ZuulException {

    /**
     * Source Throwable, message, status code and info about the cause
     *
     * @param throwable   异常基类
     * @param sMessage    异常信息
     * @param nStatusCode 异常码
     * @param errorCause  异常原因
     */
    protected AbstractException(Throwable throwable, String sMessage, int nStatusCode, String errorCause) {
        super(throwable, sMessage, nStatusCode, errorCause);
    }

    /**
     * error message, status code and info about the cause
     *
     * @param sMessage    异常信息
     * @param nStatusCode 异常码
     * @param errorCause  异常原因
     */
    protected AbstractException(String sMessage, int nStatusCode, String errorCause) {
        super(sMessage, nStatusCode, errorCause);
    }

    /**
     * Source Throwable,  status code and info about the cause
     *
     * @param throwable   异常基类
     * @param nStatusCode 异常码
     * @param errorCause  异常原因
     */
    protected AbstractException(Throwable throwable, int nStatusCode, String errorCause) {
        super(throwable, nStatusCode, errorCause);
    }
}
