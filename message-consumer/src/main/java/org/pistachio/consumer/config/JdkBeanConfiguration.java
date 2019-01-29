package org.pistachio.consumer.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Scanner;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2019/1/13 ~ 上午 1:27
 */

@Slf4j
@Configuration
public class JdkBeanConfiguration {

    @Bean
    Scanner buildScanner() {
        return new Scanner(System.in);
    }
}
