package org.pistachio.merchandise.bean;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2018/12/18 ~ 下午 5:22
 */

@Data
@Component
public class People {

	private String name;

	private int age;

	private String gender;
}
