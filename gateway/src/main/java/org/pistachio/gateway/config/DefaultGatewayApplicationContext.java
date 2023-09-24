package org.pistachio.gateway.config;

import com.google.common.collect.Maps;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.pistachio.utilities.enums.ServiceNameEnum;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Map;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2019/5/26 ~ 下午 6:53
 */

@Slf4j
@MapperScan
@Configuration
@ComponentScan(basePackages = {"org.pistachio.*"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class DefaultGatewayApplicationContext {

    private static final String API_PACKAGE = "org.pistachio.*";

    @Bean(name = {"serviceNameMap"})
    Map<String, ServiceNameEnum> initServiceNameMap() {
        Map<String, ServiceNameEnum> serviceNameEnumMap = Maps.newHashMap();
        for (ServiceNameEnum serviceNameEnum : ServiceNameEnum.values()) {
            log.info("获取到服务名：" + serviceNameEnum.getServiceName());
            serviceNameEnumMap.put(serviceNameEnum.getServiceName(), serviceNameEnum);
        }
        return serviceNameEnumMap;
    }

    @Bean
    public Docket initDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(initApiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage(API_PACKAGE))
                .paths(PathSelectors.any()).build();
    }

    @Bean
    public ApiInfo initApiInfo() {
        return new ApiInfoBuilder()
                .title("接口文档")
                .description("所有接口的文档描述")
                .version("1.0.0")
                .termsOfServiceUrl("https://www.baidu.com")
                .build();
    }
}
