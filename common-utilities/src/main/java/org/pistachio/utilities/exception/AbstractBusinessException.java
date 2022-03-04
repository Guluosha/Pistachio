package org.pistachio.utilities.exception;

/**
 * CopyRight (C),深圳市壹账通智能科技有限公司
 * <br/><b/>
 *
 * @author SingleCycle
 * @version 1.0.0
 * @date 2022/03/04 ~ 下午 9:45
 * @since 1.0.0
 */

public abstract class AbstractBusinessException extends Exception {

    protected AbstractBusinessException() {
        super();
    }

    protected AbstractBusinessException(String message) {
        super(message);
    }

    protected AbstractBusinessException(String message, Throwable cause) {
        super(message, cause);
    }

    protected AbstractBusinessException(Throwable cause) {
        super(cause);
    }
}
