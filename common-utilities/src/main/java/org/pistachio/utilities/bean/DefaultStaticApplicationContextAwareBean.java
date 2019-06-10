package org.pistachio.utilities.bean;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2019/6/10 ~ 下午 3:37
 */

@Slf4j
@Component
public class DefaultStaticApplicationContextAwareBean implements ApplicationContextAware {

    private static ApplicationContext currentApplicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        if (currentApplicationContext == null) {
            DefaultStaticApplicationContextAwareBean.currentApplicationContext = applicationContext;
        }
    }

    public static ApplicationContext getCurrentApplicationContext() {
        return currentApplicationContext;
    }
}
