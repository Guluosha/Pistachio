package org.pistachio.activity;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2018/12/17 ~ 上午 11:06
 */

@Data
@Component
public class People {

	private String name = "哇哈哈";

	public String getName() {
		return name;
	}

	@ConfigurationProperties(prefix = "people.name", ignoreInvalidFields = true)
	public void setName(String name) {
		this.name = name;
	}
}
