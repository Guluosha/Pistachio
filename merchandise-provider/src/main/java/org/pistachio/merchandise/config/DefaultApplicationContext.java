package org.pistachio.merchandise.config;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2019/5/25 ~ 上午 12:46
 */

@Slf4j
@Configuration
@ComponentScan(basePackages = {"org.pistachio.merchandise"})
@MapperScan(basePackages = {"org.pistachio.**"})
@PropertySource(value = {"classpath:application.yml"}, ignoreResourceNotFound = true, encoding = "UTF-8")
//@EnableAspectJAutoProxy(proxyTargetClass = true)
public class DefaultApplicationContext {
}
