package org.pistachio.gateway.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2019/5/26 ~ 下午 6:53
 */

@Slf4j
@Configuration
@EnableZuulProxy
@ComponentScan(basePackages = {"org.pistachio", "org.pistachio.gateway"})
@PropertySource(value = {"classpath:application.yml", "classpath:application.properties"}, encoding = "utf-8", ignoreResourceNotFound = true)
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class DefaultGatewayApplicationContext {
}
