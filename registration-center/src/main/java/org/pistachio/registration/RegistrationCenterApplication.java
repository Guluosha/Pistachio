package org.pistachio.registration;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2019/6/11 ~ 下午 3:51
 */

@Slf4j
@EnableEurekaServer
@SpringBootApplication
public class RegistrationCenterApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(RegistrationCenterApplication.class).web(WebApplicationType.SERVLET).build().run(args);
    }
}
