package org.pistachio.activity;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2018/12/17 ~ 上午 10:55
 */

@SpringBootApplication
@ComponentScan(basePackages = {"org.pistachio.*"}, lazyInit = true)
@PropertySource(value = {"classpath:application.yml"}, encoding = "utf-8", ignoreResourceNotFound = true)
public class ActivityApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ActivityApplication.class).web(WebApplicationType.NONE).build().run(args);
    }
}
