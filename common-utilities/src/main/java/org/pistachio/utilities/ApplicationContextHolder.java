package org.pistachio.utilities;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 * 容器持有器
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2018/12/16 ~ 下午 5:28
 */

@Slf4j
public class ApplicationContextHolder {

    /**
     * 容器持有器对象
     */
    private static volatile ApplicationContextHolder ourInstance = new ApplicationContextHolder();

    /**
     * 容器对象
     */
    private volatile ApplicationContext applicationContext;

    /**
     * 获取容器持有器对象
     *
     * @return ApplicationContextHolder，容器持有器对象
     */
    public static ApplicationContextHolder getInstance() {
        if (ourInstance == null) {
            synchronized (ApplicationContextHolder.class) {
                if (ourInstance == null) {
                    ourInstance = new ApplicationContextHolder();
                }
            }
        }
        return ourInstance;
    }

    private ApplicationContextHolder() {
    }

    /**
     * 设置应用容器
     *
     * @param applicationContext 容器对象
     */
    public void setApplicationContext(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    /**
     * 获取应用容器
     *
     * @return ApplicationContext，容器
     */
    public ApplicationContext getApplicationContext() {
        return applicationContext;
    }
}
