package org.pistachio.algorithms.uncategorized;

import java.util.Arrays;
import java.util.Random;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2019/6/13 ~ 下午 2:06
 */

public class InsertSort {

    public static void main(String[] args) {
        int[] numbers = new int[20];
        Random random = new Random();
        for (int index = 0; index < 20; index++) {
            numbers[index] = random.nextInt(999);
        }
        System.out.println(Arrays.toString(numbers));
        new InsertSort().insertSort(numbers);
    }

    private void insertSort(int[] numberArray) {
        long startTime = System.currentTimeMillis();
        //单独把数组长度拿出来，提高效率
        int length = numberArray.length;
        //要插入的数
        int insertNum;
        //因为第一次不用，所以从1开始
        for (int index = 1; index < length; index++) {
            insertNum = numberArray[index];
            //序列元素个数
            int tempIndex = index - 1;
            //从后往前循环，将大于insertNum的数向后移动
            while (tempIndex >= 0 && numberArray[tempIndex] > insertNum) {
                //元素向后移动
                numberArray[tempIndex + 1] = numberArray[tempIndex];
                tempIndex--;
            }
            //找到位置，插入当前元素
            numberArray[tempIndex + 1] = insertNum;
        }
        long endTime = System.currentTimeMillis();
        System.out.println(Arrays.toString(numberArray));
        System.out.println("耗时：" + (endTime - startTime));
    }
}
