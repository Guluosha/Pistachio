package org.pistachio.utilities.context;

import lombok.extern.slf4j.Slf4j;
import org.pistachio.utilities.listener.AbstractBusinessEventListener;
import org.pistachio.utilities.publisher.DefaultBusinessEventPublisher;
import org.pistachio.utilities.utils.NormalThreadFactoryUtils;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.lang.NonNull;

import java.util.Map;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 * 工具类实例化配置类
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2019/5/11 ~ 下午 5:30
 */

@Slf4j
@Configuration
@ComponentScan(basePackages = {"org.pistachio.*.*"})
public class DefaultApplicationContext implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Bean
    public static ScheduledThreadPoolExecutor scheduledThreadPoolExecutor() {
        return new ScheduledThreadPoolExecutor(Runtime.getRuntime().availableProcessors(), normalThreadFactory(), rejectedExecutionHandler());
    }

    @Bean
    public static ThreadFactory normalThreadFactory() {
        return NormalThreadFactoryUtils.builder().build();
    }

    @Bean
    public DefaultBusinessEventPublisher defaultBusinessEventPublisher() {
        DefaultBusinessEventPublisher defaultBusinessEventPublisher = DefaultBusinessEventPublisher.builder()
                .threadPoolExecutor(scheduledThreadPoolExecutor()).build();
        Map<String, AbstractBusinessEventListener> beansOfType = applicationContext.getBeansOfType(AbstractBusinessEventListener.class);
        beansOfType.forEach((beanName, businessEventListener) -> {
            log.info("注册事件监听器,beanName:{}", beanName);
            defaultBusinessEventPublisher.registerEventListener(businessEventListener);
        });
        return defaultBusinessEventPublisher;
    }

    @Bean
    public static ThreadPoolExecutor.CallerRunsPolicy rejectedExecutionHandler() {
        return new ThreadPoolExecutor.CallerRunsPolicy();
    }

    @Override
    public void setApplicationContext(@NonNull ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

}
