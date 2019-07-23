package org.pistachio.algorithms.uncategorized;

import java.util.Arrays;
import java.util.Random;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 * 冒泡排序（问题规模为n，需要比较的次数为n，时间复杂度为O(n^2)）
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
        int arraySize = numbers.length;
        for (int outerStep = 0; outerStep < arraySize - 1; outerStep++) {
            for (int innerStep = 0; innerStep < arraySize - 1 - outerStep; innerStep++) {
                //交换两数位置
                if (numbers[innerStep] > numbers[innerStep + 1]) {
                    temp = numbers[innerStep];
                    numbers[innerStep] = numbers[innerStep + 1];
                    numbers[innerStep + 1] = temp;
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
