package org.pistachio.practice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2019/7/24 ~ 下午 10:25
 */

@Slf4j
@SpringBootApplication
public class PracticeApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(PracticeApplication.class).web(WebApplicationType.SERVLET).build().run(args);
    }
}
