package org.pistachio.practice.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2019/7/24 ~ 下午 11:07
 */


@Slf4j
@RestController
public class HomePageController {

    @GetMapping(path = {"/"})
    String homePage() {
        return "返回响应";
    }
}
