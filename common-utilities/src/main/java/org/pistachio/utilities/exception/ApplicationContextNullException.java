package org.pistachio.utilities.exception;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 * 容器引用为空异常
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2019/1/13 ~ 上午 1:43
 */

public class ApplicationContextNullException extends Exception {

    private static final String EXCEPTION_DESCRIPTION = "容器引用为空";

    /**
     * Constructs a new exception with {@code null} as its detail message.
     * The cause is not initialized, and may subsequently be initialized by a
     * call to {@link #initCause}.
     */
    public ApplicationContextNullException() {
        super(EXCEPTION_DESCRIPTION);
    }

}
