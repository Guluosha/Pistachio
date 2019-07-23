package org.pistachio.utilities.exception;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2019/7/13 ~ 上午 1:51
 */

public class BadRequestException extends AbstractException {

    private static final String exceptionMessage = "bad_request_exception";

    private static final Integer statusCode = 403;

    /**
     * Source Throwable, message, status code and info about the cause
     *
     * @param throwable   异常基类
     * @param sMessage    异常信息
     * @param nStatusCode 异常码
     * @param errorCause  异常原因
     */
    public BadRequestException(Throwable throwable, String sMessage, int nStatusCode, String errorCause) {
        super(throwable, sMessage, nStatusCode, errorCause);
    }

    /**
     * error message, status code and info about the cause
     *
     * @param sMessage    异常信息
     * @param nStatusCode 异常码
     * @param errorCause  异常原因
     */
    public BadRequestException(String sMessage, int nStatusCode, String errorCause) {
        super(sMessage, nStatusCode, errorCause);
    }

    /**
     * Source Throwable,  status code and info about the cause
     *
     * @param throwable   异常基类
     * @param nStatusCode 异常码
     * @param errorCause  异常原因
     */
    public BadRequestException(Throwable throwable, int nStatusCode, String errorCause) {
        super(throwable, nStatusCode, errorCause);
    }
}
