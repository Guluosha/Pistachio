package org.pistachio.algorithms.uncategorized;

import java.util.Arrays;
import java.util.Random;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2019/6/13 ~ 下午 2:24
 */

public class SelectSort {

    public static void main(String[] args) {
        int[] numbers = new int[20];
        Random random = new Random();
        for (int index = 0; index < 20; index++) {
            numbers[index] = random.nextInt(999);
        }
        System.out.println(Arrays.toString(numbers));
        new SelectSort().selectSort(numbers);
    }

    private void selectSort(int[] numberArray) {
        int length = numberArray.length;
        //循环次数
        for (int index0 = 0; index0 < length; index0++) {
            int value = numberArray[index0];
            int position = index0;
            //找到最小的值和位置
            for (int index1 = index0 + 1; index1 < length; index1++) {
                if (numberArray[index1] < value) {
                    value = numberArray[index1];
                    position = index1;
                }
            }
            //进行交换
            numberArray[position] = numberArray[index0];
            numberArray[index0] = value;
        }
        System.out.println(Arrays.toString(numberArray));
    }
}
