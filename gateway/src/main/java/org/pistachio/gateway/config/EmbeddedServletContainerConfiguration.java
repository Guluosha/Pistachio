package org.pistachio.gateway.config;

import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.boot.autoconfigure.web.servlet.TomcatServletWebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 * 嵌入式Servlet容器配置
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2019/3/6 ~ 上午 11:14
 */

@Configuration
public class EmbeddedServletContainerConfiguration {

    @Bean
    TomcatServletWebServerFactoryCustomizer buildServletWebServerFactory(){
        return null;
    }

    @Bean
    ServerProperties buildServerProperties(){
        ServerProperties serverProperties = new ServerProperties();
        return null;
    }
}
