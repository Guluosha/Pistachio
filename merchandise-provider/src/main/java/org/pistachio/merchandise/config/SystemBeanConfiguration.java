package org.pistachio.merchandise.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Scanner;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2018/12/18 ~ 下午 6:17
 */

@Configuration
public class SystemBeanConfiguration {

	@Bean(name = "Scanner")
	public Scanner buildScanner() {
		return new Scanner(System.in);
	}
}
