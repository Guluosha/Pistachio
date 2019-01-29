package org.pistachio.consumer.config;

import lombok.extern.slf4j.Slf4j;
import org.pistachio.consumer.properties.RabbitInputChannelProperties;
import org.pistachio.consumer.properties.ThreadPoolExecutorProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2018/12/16 ~ 下午 11:12
 */

@Slf4j
@Configuration
@EnableConfigurationProperties(value = {ThreadPoolExecutorProperties.class, RabbitInputChannelProperties.class})
public class CustomPropertiesConfiguration {

}
