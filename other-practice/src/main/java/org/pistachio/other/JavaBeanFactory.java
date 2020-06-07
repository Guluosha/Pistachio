package org.pistachio.other;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;

/**
 * CopyRight (C),深圳市有限公司
 * <br/><b/>
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2020/04/18/星期六 ~ 下午 3:54
 */

public class JavaBeanFactory {

    public static void main(String[] args) throws IntrospectionException {
        BeanInfo beanInfo = Introspector.getBeanInfo(MultiThread.class);
        System.out.println(beanInfo.getBeanDescriptor().getName());
        System.out.println(beanInfo.getBeanDescriptor().getDisplayName());
    }
}
