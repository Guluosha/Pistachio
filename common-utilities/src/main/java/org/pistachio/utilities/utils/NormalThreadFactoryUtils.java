package org.pistachio.utilities.utils;

import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @version 1.0.0
 * @date 2021/06/13,013 ~ 下午 2:19
 */

@Data
@SuperBuilder
public class NormalThreadFactoryUtils implements ThreadFactory {

    private static final String THREAD_NAME_PREFIX = "通用线程";

    private final AtomicInteger threadCounter = new AtomicInteger(0);

    @Override
    public Thread newThread(Runnable runnable) {
        return runnable == null ? null : new Thread(runnable, THREAD_NAME_PREFIX + threadCounter.getAndIncrement());
    }
}
