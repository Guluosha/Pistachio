package org.pistachio.utilities.listener;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2019/5/11 ~ 下午 10:46
 */

public interface ErrorHandler {

    /**
     * 处理错误
     *
     * @param throwable 异常基类
     */
    void handleError(Throwable throwable);

    /**
     * 处理错误信息
     *
     * @param errorMessage 错误信息
     * @param throwable    新的错误
     */
    void handleError(String errorMessage, Throwable throwable);
}
