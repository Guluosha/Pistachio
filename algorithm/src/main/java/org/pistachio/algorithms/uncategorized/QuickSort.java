package org.pistachio.algorithms.uncategorized;

import java.util.Arrays;
import java.util.Random;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2019/6/13 ~ 下午 2:38
 */

public class QuickSort {

    public static void main(String[] args) {
        int[] numbers = new int[20];
        Random random = new Random();
        for (int index = 0; index < 20; index++) {
            numbers[index] = random.nextInt(999);
        }
        System.out.println(Arrays.toString(numbers));
        new QuickSort().quickSort(numbers, 2, 10);
    }

    private void quickSort(int[] numberArray, int start, int end) {
        if (start < end) {
            //选基准值
            int baseNumber = numberArray[start];
            //记录中间值
            int midNumber;
            int index0 = start;
            int index1 = end;
            do
            {
                while ((numberArray[index0] < baseNumber) && index0 < end) {
                    index0++;
                }
                while ((numberArray[index1] > baseNumber) && index1 > start) {
                    index1--;
                }
                if (index0 <= index1) {
                    midNumber = numberArray[index0];
                    numberArray[index0] = numberArray[index1];
                    numberArray[index1] = midNumber;
                    index0++;
                    index1--;
                }
            }
            while (index0 <= index1);
            if (start < index1) {
                quickSort(numberArray, start, index1);
            }
            if (end > index0) {
                quickSort(numberArray, index0, end);
            }
        }
        System.out.println(Arrays.toString(numberArray));
    }
}
