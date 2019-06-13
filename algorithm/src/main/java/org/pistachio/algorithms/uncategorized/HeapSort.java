package org.pistachio.algorithms.uncategorized;

import java.util.Arrays;
import java.util.Random;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2019/6/13 ~ 下午 2:30
 */

public class HeapSort {

    public static void main(String[] args) {
        int[] numbers = new int[20];
        Random random = new Random();
        for (int index = 0; index < 20; index++) {
            numbers[index] = random.nextInt(999);
        }
        System.out.println(Arrays.toString(numbers));
        new HeapSort().heapSort(numbers);
    }

    private void heapSort(int[] numberArray) {
        int length = numberArray.length;
        //循环建堆
        for (int index = 0; index < length - 1; index++) {
            //建堆
            buildMaxHeap(numberArray, length - 1 - index);
            //交换堆顶和最后一个元素
            swap(numberArray, 0, length - 1 - index);
        }
        System.out.println(Arrays.toString(numberArray));
    }

    //交换方法
    private void swap(int[] data, int i, int j) {
        int tmp = data[i];
        data[i] = data[j];
        data[j] = tmp;
    }

    //对data数组从0到lastIndex建大顶堆
    private void buildMaxHeap(int[] data, int lastIndex) {
        //从lastIndex处节点（最后一个节点）的父节点开始
        for (int index = (lastIndex - 1) / 2; index >= 0; index--) {
            //k保存正在判断的节点
            int k = index;
            //如果当前k节点的子节点存在
            while (k * 2 + 1 <= lastIndex) {
                //k节点的左子节点的索引
                int biggerIndex = 2 * k + 1;
                //如果biggerIndex小于lastIndex，即biggerIndex+1代表的k节点的右子节点存在
                if (biggerIndex < lastIndex) {
                    //若果右子节点的值较大
                    if (data[biggerIndex] < data[biggerIndex + 1]) {
                        //biggerIndex总是记录较大子节点的索引
                        biggerIndex++;
                    }
                }
                //如果k节点的值小于其较大的子节点的值
                if (data[k] < data[biggerIndex]) {
                    //交换他们
                    swap(data, k, biggerIndex);
                    //将biggerIndex赋予k，开始while循环的下一次循环，重新保证k节点的值大于其左右子节点的值
                    k = biggerIndex;
                } else {
                    break;
                }
            }
        }
    }
}
