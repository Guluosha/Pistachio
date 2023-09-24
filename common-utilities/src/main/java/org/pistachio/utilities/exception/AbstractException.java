package org.pistachio.utilities.exception;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 * 自定义异常消息包装类
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2019/3/23 ~ 上午 11:52
 */

public abstract class AbstractException extends Exception {

    /**
     * Source Throwable,  status code and info about the cause
     *
     * @param errorCause 异常原因
     */
    protected AbstractException(String errorCause) {
        super(errorCause);
    }

    /**
     * Source Throwable, message, status code and info about the cause
     *
     * @param throwable 异常基类
     * @param message   异常信息
     */
    protected AbstractException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
