package org.pistachio.consumer;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 * 消息消费者入口
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2018/12/16 ~ 下午 11:06
 */

@SpringBootApplication
@PropertySource(value = {"classpath*:*.yml"}, encoding = "utf-8", ignoreResourceNotFound = true)
@ComponentScan(basePackages = {"org.pistachio.*"}, lazyInit = true)
public class MessageConsumerApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = new SpringApplicationBuilder(MessageConsumerApplication.class).web(WebApplicationType.NONE).build().run(args);
    }
}
