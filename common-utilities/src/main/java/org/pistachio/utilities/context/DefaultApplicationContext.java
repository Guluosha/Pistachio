package org.pistachio.utilities.context;

import com.google.common.collect.Sets;
import lombok.extern.slf4j.Slf4j;
import org.pistachio.utilities.listener.BusinessEventListener;
import org.pistachio.utilities.publisher.DefaultBusinessEventPublisher;
import org.pistachio.utilities.utils.NormalThreadFactoryUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
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
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
@Configuration
@ComponentScan(basePackages = {"org.pistachio.*.*"})
public class DefaultApplicationContext implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Bean(name = {"scheduledThreadPoolExecutor"})
    ScheduledThreadPoolExecutor initializeScheduledThreadPoolExecutor() {
        return new ScheduledThreadPoolExecutor(Runtime.getRuntime().availableProcessors(), buildThreadFactory(), buildRejectedExecutionHandler());
    }

    @Bean(name = {"normalThreadFactory"})
    @Scope(scopeName = ConfigurableBeanFactory.SCOPE_SINGLETON)
    ThreadFactory buildThreadFactory() {
        return NormalThreadFactoryUtils.builder().build();
    }

    @Bean(name = "defaultBusinessEventPublisher")
    @Scope(scopeName = ConfigurableBeanFactory.SCOPE_SINGLETON)
    DefaultBusinessEventPublisher initDefaultBusinessPublisher() {
        DefaultBusinessEventPublisher defaultBusinessEventPublisher = DefaultBusinessEventPublisher.builder()
                .businessEventListenerSet(Sets.newHashSet())
                .threadPoolExecutor(initializeScheduledThreadPoolExecutor())
                .build();
        Map<String, BusinessEventListener> beansOfType = applicationContext.getBeansOfType(BusinessEventListener.class);
        for (String beanName : beansOfType.keySet()) {
            defaultBusinessEventPublisher.registerEventListener(applicationContext.getBean(beanName, BusinessEventListener.class));
        }
        return defaultBusinessEventPublisher;
    }

    @Bean
    ThreadPoolExecutor.CallerRunsPolicy buildRejectedExecutionHandler() {
        return new ThreadPoolExecutor.CallerRunsPolicy();
    }

    @Override
    public void setApplicationContext(@NonNull ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

}
