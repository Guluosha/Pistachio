package org.pistachio.merchandise.component.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 * 这里的EL表达式的参数名为定义的切点方法的参数名，与AOP的实现机制无关，但是为了方便阅读和理解，建议还是和切点的参数名保持一致
 * 此处建议使用@Component注解，表明本类为一个普通Bean，实际也应该为一个普通Bean，在Spring实战（第4版）中有讲到，具体原因，看源码吧
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2018/12/18 ~ 下午 5:35
 */

@Aspect
@Component
public class PeopleAspect {

	@Pointcut(value = "execution(* org.pistachio.merchandise.service.PeopleExecutorForTest.setupPeopleName(..)) && args(name)")
	private void setupPeopleName(String name) {
	}

	@Pointcut(value = "execution(* org.pistachio.merchandise.service.PeopleExecutorForTest.setupPeopleGender(..)) && args(gender)")
	private void setupPeopleGender(String gender) {
	}

	@Before(value = "setupPeopleName(name)", argNames = "name")
	private void checkPeopleName(String name) {
		if ("我".equalsIgnoreCase(name)) {
			System.out.println("名字错了，不能叫：" + name);
		}
		System.out.println("在方法：setupPeopleName 执行之前，先输出这句话");
	}

	@Before(value = "setupPeopleGender(gender)", argNames = "gender")
	private void checkPeopleGender(String gender) {
		if ("人妖".equalsIgnoreCase(gender)) {
			System.out.println("性别错了，不能是：" + gender);
		}
		System.out.println("在方法：setupPeopleGender 执行之前，");
	}

	@After(value = "setupPeopleName(name)", argNames = "name")
	private void printPeopleName(String name) {
		System.out.println("方法执行完毕，方法setupPeopleName返回前输出当前语句，姓名为：" + name);
	}

	@After(value = "setupPeopleGender(gender)", argNames = "gender")
	private void printPeopleGender(String gender) {
		System.out.println("方法执行完毕，方法setupPeopleGender返回前输出当前语句：性别为：" + gender);
	}

	/**
	 * 这里的returning指的是返回值类型，IDEA对于这儿的参数检查貌似有问题（个人猜测，还未证实）
	 *
	 * @param name 参数，自定义，与切面方法中的参数一致
	 */
	@SuppressWarnings("ArgNamesErrorsInspection")
	@AfterReturning(pointcut = "setupPeopleName(name)", returning = "java.lang.String", argNames = "name")
	private void recordPeopleName(String name) {
		System.out.println("现在是方法setupPeopleName返回后执行，设置的姓名为：" + name);
	}

	/**
	 * 这里的returning指的是返回值类型，IDEA对于这儿的参数检查貌似有问题（个人猜测，还未证实）
	 *
	 * @param gender 参数，自定义，与切面方法中的参数一致
	 */
	@SuppressWarnings("ArgNamesErrorsInspection")
	@AfterReturning(pointcut = "setupPeopleGender(gender)", returning = "java.lang.String", argNames = "gender")
	private void recordPeopleGender(String gender) {
		System.out.println("现在是方法setupPeopleGender返回后执行，设置的性别为：" + gender);
	}
}
