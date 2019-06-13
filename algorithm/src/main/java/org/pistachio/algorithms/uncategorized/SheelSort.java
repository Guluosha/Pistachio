package org.pistachio.algorithms.uncategorized;

import java.util.Arrays;
import java.util.Random;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2019/6/13 ~ 下午 2:18
 */

public class SheelSort {

    public static void main(String[] args) {
        int[] numbers = new int[20];
        Random random = new Random();
        for (int index = 0; index < 20; index++) {
            numbers[index] = random.nextInt(999);
        }
        System.out.println(Arrays.toString(numbers));
        new SheelSort().sheelSort(numbers);
    }

    private void sheelSort(int[] numberArray) {
        //单独把数组长度拿出来，提高效率
        int length = numberArray.length;
        while (length != 0) {
            length = length / 2;
            //分组
            for (int index = 0; index < length; index++) {
                //元素从第二个开始
                for (int j = index + length; j < numberArray.length; j += length) {
                    //k为有序序列最后一位的位数
                    int k = j - length;
                    //要插入的元素
                    int temp = numberArray[j];
                    /*for (; k >= 0 && temp < a[k]; k -= len) {
                        a[k + len] = a[k];
                    }*/
                    //从后往前遍历
                    while (k >= 0 && temp < numberArray[k]) {
                        numberArray[k + length] = numberArray[k];
                        //向后移动length位
                        k -= length;
                    }
                    numberArray[k + length] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(numberArray));
    }
}
