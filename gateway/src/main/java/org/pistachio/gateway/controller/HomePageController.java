package org.pistachio.gateway.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2019/9/19 ~ 下午 10:46
 */

@Slf4j
@RestController
@RequestMapping(path = {"/homepage"})
public class HomePageController {

    @RequestMapping(method = RequestMethod.GET, path = {"/index"})
    String homePage() {
        return "这是网关";
    }
}
