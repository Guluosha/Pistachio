package org.pistachio.utilities.bean;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
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
 * @date 2019/6/10 ~ 下午 3:54
 */

@Slf4j
@Component
public class DefaultApplicationContextAwareBean implements ApplicationContextAware {

    @Getter
    private ApplicationContext currentApplicationContext;

    @Override
    public void setApplicationContext(@Nullable ApplicationContext applicationContext) throws BeansException {
        if (this.currentApplicationContext == null) {
            this.currentApplicationContext = applicationContext;
        }
    }

}
