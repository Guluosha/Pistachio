package org.pistachio.gateway.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;
import org.springframework.context.annotation.ComponentScan;
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
@EnableZuulProxy
@EnableEurekaServer
@EnableZuulServer
@ComponentScan(basePackages = {"org.pistachio"})
@PropertySource(value = {"classpath*:application.yml"}, encoding = "utf-8", ignoreResourceNotFound = true)
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class DefaultGatewayApplicationContext {
}
