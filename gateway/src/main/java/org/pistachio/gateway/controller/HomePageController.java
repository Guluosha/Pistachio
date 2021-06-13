package org.pistachio.gateway.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.pistachio.gateway.constants.ResponseCodeConstants;
import org.pistachio.utilities.component.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2019/9/19 ~ 下午 10:46
 */

@Api(tags = {"主页接口"})
@Slf4j
@RestController
@RequestMapping(path = {"/homepage"})
public class HomePageController {

    @ApiOperation(value = "主页接口", notes = "主页接口")
    @GetMapping(path = {"/index"})
    public Result<String> homePage() {
        return Result.<String>builder()
                .code(ResponseCodeConstants.OK)
                .msg("成功")
                .data("这个网关").build();
    }
}
