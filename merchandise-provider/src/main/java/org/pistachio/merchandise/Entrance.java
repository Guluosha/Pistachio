package org.pistachio.merchandise;

import lombok.extern.slf4j.Slf4j;
import org.pistachio.merchandise.service.PeopleExecutor;
import org.pistachio.utilities.ApplicationContextHolder;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;

import javax.annotation.Resource;
import java.util.Scanner;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2018/12/18 ~ 下午 5:28
 */

@Slf4j
@Configuration
@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
@ComponentScan(basePackages = {"org.pistachio.merchandise.**"}, lazyInit = true)
@PropertySource(value = "classpath:application.yml", encoding = "utf-8", ignoreResourceNotFound = true)
public class Entrance {

    @Resource
    private PeopleExecutor peopleExecutor;

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = new SpringApplicationBuilder(Entrance.class).web(WebApplicationType.NONE).build().run(args);
        ApplicationContextHolder.getInstance().setApplicationContext(applicationContext);
        Entrance entrance = applicationContext.getBean(Entrance.class);
        entrance.buildPeople();
    }

    private void buildPeople() {
        String name;
        String gender;
        do
        {
            Scanner scanner = ApplicationContextHolder.getInstance().getApplicationContext().getBean("Scanner", Scanner.class);
            log.info("输入名字：");
            name = scanner.next();
            String peopleName = peopleExecutor.setupPeopleName(name);
            log.info("现在是方法setupPeopleName返回了，打印方法setupPeopleName的返回值:" + peopleName);
            log.info("输入性别：");
            gender = scanner.next();
            String peopleGender = peopleExecutor.setupPeopleGender(gender);
            log.info("现在是方法setupPeopleGender返回了，打印方法setupPeopleGender的返回值:" + peopleGender);
        }
        while (!"人妖".equalsIgnoreCase(gender));
    }
}
