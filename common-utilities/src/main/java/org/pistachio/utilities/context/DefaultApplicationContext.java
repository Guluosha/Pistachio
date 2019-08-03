package org.pistachio.utilities.context;

import com.google.common.collect.Sets;
import lombok.extern.slf4j.Slf4j;
import org.pistachio.utilities.listener.BusinessEventListener;
import org.pistachio.utilities.publisher.DefaultBusinessEventPublisher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.lang.Nullable;

import javax.annotation.Resource;
import java.util.Map;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;

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
@ComponentScan(basePackages = {"org.pistachio.utilities"})
public class DefaultApplicationContext {

    @Resource
    private ApplicationContext applicationContext;

    @Bean(name = {"ScheduledThreadPoolExecutor"})
    ScheduledThreadPoolExecutor initializeScheduledThreadPoolExecutor() {
        return new ScheduledThreadPoolExecutor(Runtime.getRuntime().availableProcessors() << 2, buildThreadFactory(), buildRejectedExecutionHandler());
    }

    @Bean(name = {"CommonThreadFactory"})
    ThreadFactory buildThreadFactory() {
        return new CommonThreadFactory();
    }

    @Bean(name = "DefaultBusinessEventPublisher")
    @Scope(scopeName = "singleton")
    DefaultBusinessEventPublisher initDefaultBusinessPublisher() {
        DefaultBusinessEventPublisher defaultBusinessEventPublisher = DefaultBusinessEventPublisher.builder()
                .businessEventListenerSet(Sets.newConcurrentHashSet())
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

    private class CommonThreadFactory implements ThreadFactory {

        private String threadNamePrefix = "通用线程";

        private AtomicInteger threadCounter = new AtomicInteger(0);

        /**
         * Constructs a new {@code Thread}.  Implementations may also initialize
         * priority, name, daemon status, {@code ThreadGroup}, etc.
         *
         * @param runnable a runnable to be executed by new thread instance
         * @return constructed thread, or {@code null} if the request to
         * create a thread is rejected
         */
        @Override
        public Thread newThread(@Nullable Runnable runnable) {
            if (runnable == null) {
                return null;
            }
            return new Thread(runnable, threadNamePrefix + threadCounter);
        }
    }
}