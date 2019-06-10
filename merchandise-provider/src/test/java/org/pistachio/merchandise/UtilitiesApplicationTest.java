package org.pistachio.merchandise;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.pistachio.merchandise.event.MerchandiseAuditEvent;
import org.pistachio.merchandise.eventsource.MerchandiseAuditEventSource;
import org.pistachio.utilities.bean.DefaultApplicationContextAwareBean;
import org.pistachio.utilities.listener.BusinessEventListener;
import org.pistachio.utilities.publisher.DefaultBusinessEventPublisher;
import org.springframework.beans.factory.BeanFactoryUtils;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.MethodParameter;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import javax.annotation.Resource;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.util.Map;
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
@SpringBootTest(classes = {MerchandiseApplication.class})
@TestPropertySource(locations = {"classpath:test/application.yml"})
public class UtilitiesApplicationTest {

    @Resource
    private DefaultApplicationContextAwareBean defaultApplicationContextAwareBean;

    @Resource
    private DefaultBusinessEventPublisher defaultBusinessEventPublisher;

    @Resource
    private RequestMappingHandlerMapping requestMappingHandlerMapping;

    @Test
    public void displayBeanInformation() {
        System.out.println("\n\n#################\n");
//        System.out.println(DefaultStaticApplicationContextAwareBean.getCurrentApplicationContext().getBean(MerchandiseAuditEventSource.class));
        System.out.println(defaultApplicationContextAwareBean.getCurrentApplicationContext().getBean(MerchandiseAuditEventSource.class));
        System.out.println("\n#################\n\n");
    }

    @Test
    public void getAllHandlerMappingBeans() {
//        Map<String, HandlerMapping> stringHandlerMappingMap = BeanFactoryUtils.beansOfTypeIncludingAncestors(DefaultStaticApplicationContextAwareBean.getCurrentApplicationContext(), HandlerMapping.class, true, false);
        Map<String, HandlerMapping> stringHandlerMappingMap = BeanFactoryUtils.beansOfTypeIncludingAncestors(defaultApplicationContextAwareBean.getCurrentApplicationContext(), HandlerMapping.class, true, false);
        for (String handlerMappingName : stringHandlerMappingMap.keySet()) {
            System.out.println("\n#################\nHandlerMapping：");
//            System.out.println(DefaultStaticApplicationContextAwareBean.getCurrentApplicationContext().getBean(handlerMappingName));
            System.out.print(defaultApplicationContextAwareBean.getCurrentApplicationContext().getBean(handlerMappingName));
        }
        System.out.println("\n#################\n");
    }

    @Test
    public void getAllHandlerMappingBeansWithParameter() {
        Map<RequestMappingInfo, HandlerMethod> handlerMethods = requestMappingHandlerMapping.getHandlerMethods();
        System.out.println();
        for (Map.Entry<RequestMappingInfo, HandlerMethod> requestMappingInfoHandlerMethodEntry : handlerMethods.entrySet()) {
            System.out.println("#################\nHandlerMapping：");
            System.out.println(requestMappingInfoHandlerMethodEntry.getKey());
            System.out.println(requestMappingInfoHandlerMethodEntry.getValue());
            for (MethodParameter methodParameter : requestMappingInfoHandlerMethodEntry.getValue().getMethodParameters()) {
                System.out.println(methodParameter.getParameterType() + " ------ " + methodParameter.getParameter().getName());
            }
        }
        System.out.println("#################\n");
    }

    @Test
    public void ifSuccessInitialEventPublisher() {
        Set<BusinessEventListener> businessEventListenerSet = defaultBusinessEventPublisher.getBusinessEventListenerSet();
        for (BusinessEventListener businessEventListener : businessEventListenerSet) {
            System.out.println("\n\n#################\n" + businessEventListener.getClass().getName() + "\n#################\n");
        }
    }

    @Test
    public void publisherBusinessEventByManual() throws InterruptedException {
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
//        MerchandiseAuditEventSource auditEventSource = DefaultStaticApplicationContextAwareBean.getCurrentApplicationContext().getBean(MerchandiseAuditEventSource.class);
        MerchandiseAuditEventSource auditEventSource = defaultApplicationContextAwareBean.getCurrentApplicationContext().getBean(MerchandiseAuditEventSource.class);
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
