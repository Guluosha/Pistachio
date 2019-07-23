package org.pistachio.gateway;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.pistachio.gateway.bean.property.CustomerZuulFilterProperty;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2019/7/9 ~ 上午 12:21
 */

@RunWith(value = MockitoJUnitRunner.class)
@ContextConfiguration(classes = {GatewayApplication.class})
public class CustomerPropertyTest {

    //    @Resource
    @MockBean
    private CustomerZuulFilterProperty customerZuulFilterProperty;

    @Test
    public void displayProperty() {
        System.out.println(customerZuulFilterProperty.getAuthFilterUrl());
        System.out.println(customerZuulFilterProperty.getCertificationUrl());
    }
}
