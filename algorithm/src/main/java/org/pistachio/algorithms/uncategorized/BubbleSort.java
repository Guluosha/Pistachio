package org.pistachio.algorithms.uncategorized;

import java.util.Arrays;
import java.util.Random;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2019/6/13 ~ 下午 12:02
 */

public class BubbleSort {

    public static void main(String[] args) {
        int[] numbers = new int[20];
        Random random = new Random();
        for (int index = 0; index < 20; index++) {
            numbers[index] = random.nextInt(999);
        }
        System.out.println(Arrays.toString(numbers));
//        new BubbleSort().bubbleSort(numbers);
        new BubbleSort().bubbleSortAnother(numbers);
    }

    private void bubbleSort(int[] numbers) {
        int temp;
        int size = numbers.length;
        for (int index0 = 0; index0 < size - 1; index0++) {
            for (int index1 = 0; index1 < size - 1 - index0; index1++) {
                //交换两数位置
                if (numbers[index1] > numbers[index1 + 1]) {
                    temp = numbers[index1];
                    numbers[index1] = numbers[index1 + 1];
                    numbers[index1 + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
    }

    private void bubbleSortAnother(int[] numberArray) {
        int length = numberArray.length;
        for (int index0 = 0; index0 < length; index0++) {
            //注意第二重循环的条件
            for (int index1 = 0; index1 < length - index0 - 1; index1++) {
                if (numberArray[index1] > numberArray[index1 + 1]) {
                    int temp = numberArray[index1];
                    numberArray[index1] = numberArray[index1 + 1];
                    numberArray[index1 + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(numberArray));
    }
}
