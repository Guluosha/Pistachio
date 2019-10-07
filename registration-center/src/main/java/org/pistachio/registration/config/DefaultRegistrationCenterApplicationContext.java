package org.pistachio.registration.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @since 2019/10/7 ~ 下午 10:56
 */

@Slf4j
@EnableEurekaServer
@Configuration
@ComponentScan(basePackages = {"org.pistachio.*"})
public class DefaultRegistrationCenterApplicationContext {
}
