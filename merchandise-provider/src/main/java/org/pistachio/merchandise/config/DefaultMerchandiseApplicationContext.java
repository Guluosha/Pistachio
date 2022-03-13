package org.pistachio.merchandise.config;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.pistachio.merchandise.listener.base.AbstractMerchandiseBusinessEventListener;
import org.pistachio.merchandise.publisher.DefaultMerchandiseEventPublisher;
import org.pistachio.utilities.context.DefaultApplicationContext;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.*;

import java.util.Map;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2019/5/25 ~ 上午 12:46
 */

@Slf4j
@Configuration
@ComponentScan(basePackages = {"org.pistachio.merchandise", "org.pistachio.utilities"})
@MapperScan(basePackages = {"org.pistachio.*.persistence"})
@PropertySource(value = {"classpath:application.yml"}, ignoreResourceNotFound = true, encoding = "UTF-8")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class DefaultMerchandiseApplicationContext implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Bean
    public DefaultMerchandiseEventPublisher defaultMerchandiseEventPublisher() {
        DefaultMerchandiseEventPublisher merchandiseEventPublisher = DefaultMerchandiseEventPublisher.builder()
                .threadPoolExecutor(DefaultApplicationContext.scheduledThreadPoolExecutor()).build();
        Map<String, AbstractMerchandiseBusinessEventListener> eventListenerMap = applicationContext.getBeansOfType(AbstractMerchandiseBusinessEventListener.class);
        eventListenerMap.forEach((listenerName, businessEventListener) -> {
            log.info("注册事件监听器:{}", listenerName);
            merchandiseEventPublisher.registerEventListener(businessEventListener);
        });
        return merchandiseEventPublisher;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
