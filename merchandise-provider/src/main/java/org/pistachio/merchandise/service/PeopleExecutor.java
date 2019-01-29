package org.pistachio.merchandise.service;

import lombok.extern.slf4j.Slf4j;
import org.pistachio.merchandise.bean.People;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2018/12/18 ~ 下午 7:09
 */

@Slf4j
@Component
public class PeopleExecutor {

	@Resource
	private People people;

	public String setupPeopleName(String name) {
		people.setName(name);
		System.out.println("####################");
		System.out.println(people.getName());
		System.out.println("####################");
		return name;
	}

	public String setupPeopleGender(String gender) {
		people.setGender(gender);
		System.out.println("####################");
		System.out.println(people.getGender());
		System.out.println("####################");
		return gender;
	}
}
