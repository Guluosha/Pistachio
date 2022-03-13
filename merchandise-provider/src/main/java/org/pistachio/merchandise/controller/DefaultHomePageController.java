package org.pistachio.merchandise.controller;

import lombok.extern.slf4j.Slf4j;
import org.pistachio.merchandise.event.MerchandiseAuditEvent;
import org.pistachio.merchandise.publisher.DefaultMerchandiseEventPublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2019/5/26 ~ 下午 10:20
 */

@Slf4j
@RestController
public class DefaultHomePageController {

    @Autowired
    private DefaultMerchandiseEventPublisher eventPublisher;

    @GetMapping(path = {"/"})
    public String wellComePage(@RequestParam(name = "name") String name) {
        log.info("返回请求：");
        return "欢迎";
    }

    @GetMapping(path = {"/audit/{merchandiseName}"})
    public String auditMerchandise(@PathVariable(name = "merchandiseName") String merchandiseName) {
        eventPublisher.publishEvent(new MerchandiseAuditEvent(merchandiseName));
        eventPublisher.publishEvent(null);
        return merchandiseName;
    }
}
