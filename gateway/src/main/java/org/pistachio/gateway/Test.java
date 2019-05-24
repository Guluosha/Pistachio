package org.pistachio.gateway;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2019/3/22 ~ 下午 6:08
 */

public class Test {

    public static void main(String[] args) {
        Calendar instance = Calendar.getInstance();
        instance.setTime(new Date());
        instance.set(Calendar.YEAR, 0);
        instance.set(Calendar.MONTH, 0);
        instance.set(Calendar.DATE, 0);
        instance.set(Calendar.SECOND, 0);
        Date time1 = instance.getTime();
        Date time = Calendar.getInstance().getTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = simpleDateFormat.format(time1);
        System.out.println(time1);
    }

}
