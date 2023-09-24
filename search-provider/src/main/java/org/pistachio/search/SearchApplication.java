package org.pistachio.search;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.PropertySource;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2019/9/19 ~ 下午 11:05
 */

@Slf4j
@EnableEurekaClient
@SpringBootApplication
@PropertySource(value = {"classpath:application.yml"}, encoding = "utf-8")
public class SearchApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(SearchApplication.class).web(WebApplicationType.SERVLET).build().run(args);
    }
}
