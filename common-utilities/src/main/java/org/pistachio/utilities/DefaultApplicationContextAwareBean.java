package org.pistachio.utilities;

import lombok.Data;
import lombok.Getter;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2019/7/27 ~ 下午 11:45
 */

@Component
public class DefaultApplicationContextAwareBean implements ApplicationContextAware {

    @Getter
    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(@Nullable ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public ApplicationContext getApplicationContext() {
        return applicationContext;
    }
}
