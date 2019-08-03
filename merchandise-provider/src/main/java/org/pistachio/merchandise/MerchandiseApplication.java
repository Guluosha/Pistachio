package org.pistachio.merchandise;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2019/5/25 ~ 上午 12:43
 */

@Slf4j
@SpringBootApplication(scanBasePackages = {"org.pistachio.*.config"})
public class MerchandiseApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(MerchandiseApplication.class).web(WebApplicationType.SERVLET).build().run(args);
    }
}
