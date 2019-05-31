package org.pistachio.merchandise;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.pistachio.utilities.context.DefaultApplicationContext;
import org.pistachio.utilities.event.concrete.MerchandiseAuditEvent;
import org.pistachio.utilities.eventsource.MerchandiseAuditEventSource;
import org.pistachio.utilities.listener.interfaces.BusinessEventListener;
import org.pistachio.utilities.publisher.DefaultBusinessEventPublisher;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2019/5/12 ~ 下午 11:08
 */

@Slf4j
@RunWith(value = SpringRunner.class)
@ContextConfiguration(classes = {DefaultApplicationContext.class})
@TestPropertySource(locations = {"classpath:test/application.yml"})
public class UtilitiesApplicationTest {

    @Resource
    private ConfigurableApplicationContext applicationContext;

    @Resource
    private DefaultBusinessEventPublisher defaultBusinessEventPublisher;

    @Test
    public void displayBeanInformation() {
        System.out.println("\n\n#################\n");
        System.out.println(applicationContext.getBean(MerchandiseAuditEventSource.class));
        System.out.println("\n#################\n\n");
    }

    @Test
    public void TestIfSuccessInitialEventPublisher() {
        Set<BusinessEventListener> businessEventListenerSet = defaultBusinessEventPublisher.getBusinessEventListenerSet();
        for (BusinessEventListener businessEventListener : businessEventListenerSet) {
            System.out.println("\n\n#################\n" + businessEventListener.getClass().getName() + "\n#################\n");
        }
    }

    @Test
    public void TestPublisherBusinessEventByManual() throws InterruptedException {
        AtomicInteger atomicInteger = new AtomicInteger(10);
        for (int counter = 0; counter < atomicInteger.get(); counter++) {
            System.out.println("开始程序");
            String idString = String.valueOf(new Random().nextInt(99999999));
            String name = buildRandomString();
            System.out.println("输入id：" + idString);
            System.setIn(new BufferedInputStream(new ByteArrayInputStream(idString.getBytes())));
            Scanner scanner = new Scanner(System.in);
            String id = scanner.next();
            scanner.reset();
            System.out.println("输入姓名：" + name);
            System.setIn(new BufferedInputStream(new ByteArrayInputStream(name.getBytes())));
            scanner = new Scanner(System.in);
            name = scanner.next();
            scanner.reset();
            MerchandiseAuditEventSource merchandiseAuditEventSource = buildBusinessEventSource(Long.parseLong(id), name);
            MerchandiseAuditEvent merchandiseAuditEvent = new MerchandiseAuditEvent(merchandiseAuditEventSource);
            System.out.println("发布事件：" + merchandiseAuditEvent.getCurrentEventName());
            defaultBusinessEventPublisher.publishEvent(merchandiseAuditEvent);
            TimeUnit.SECONDS.sleep(1);
        }
    }

    private MerchandiseAuditEventSource buildBusinessEventSource(Long id, String name) {
        MerchandiseAuditEventSource auditEventSource = applicationContext.getBean(MerchandiseAuditEventSource.class);
        auditEventSource.setId(id);
        auditEventSource.setMerchandiseName(name);
        return auditEventSource;
    }

    private String buildRandomString() {
        String[] candidate = {"乱七八糟", "不知道怎么写", "天了噜", "不玩儿了", "真难弄"};
        int random = new Random().nextInt(5);
        return candidate[random];
    }
}
