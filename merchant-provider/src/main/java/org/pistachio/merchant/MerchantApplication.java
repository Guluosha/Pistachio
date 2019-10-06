package org.pistachio.merchant;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @since 2019/10/6 ~ 下午 2:48
 */

@Slf4j
@ComponentScan(basePackages = {"org.pistachio.*"}, lazyInit = true)
@PropertySource(value = {"classpath:application.yml"}, ignoreResourceNotFound = true)
@SpringCloudApplication
public class MerchantApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(MerchantApplication.class).web(WebApplicationType.SERVLET).build().run(args);
    }
}
