package org.pistachio.merchandise.bean;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.pistachio.utilities.validate.Survey;
import org.springframework.stereotype.Component;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2018/12/18 ~ 下午 5:22
 */

@Data
@Slf4j
@Component
public class PeopleForTest {

    @Survey(message = "查勘类型不对")
    private String name;

    private int age;

    @Survey(message = "年龄不对")
    private String gender;
}
