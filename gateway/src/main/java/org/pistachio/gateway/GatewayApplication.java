package org.pistachio.gateway;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 * 网关启动类
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2018/12/17 ~ 下午 1:22
 */

@Slf4j
@EnableZuulProxy
@ComponentScan(basePackages = {"org.pistachio.*"}, lazyInit = true)
@PropertySource(value = {"classpath*:*.yml"}, encoding = "utf-8", ignoreResourceNotFound = true)
@SpringCloudApplication
public class GatewayApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(GatewayApplication.class).web(WebApplicationType.SERVLET).build().run(args);
    }
}
