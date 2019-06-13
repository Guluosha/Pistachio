package org.pistachio.algorithms.uncategorized;

import java.util.Arrays;
import java.util.Random;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2019/6/13 ~ 下午 2:43
 */

public class MergeSort {

    public static void main(String[] args) {
        int[] numbers = new int[20];
        Random random = new Random();
        for (int index = 0; index < 20; index++) {
            numbers[index] = random.nextInt(999);
        }
        System.out.println(Arrays.toString(numbers));
        new MergeSort().mergeSort(numbers, 4, 6);
    }

    private void mergeSort(int[] a, int left, int right) {
        // 每组元素个数
        int t = 1;
        int size = right - left + 1;
        while (t < size) {
            // 本次循环每组元素个数
            int s = t;
            t = 2 * s;
            int i = left;
            while (i + (t - 1) < size) {
                merge(a, i, i + (s - 1), i + (t - 1));
                i += t;
            }
            if (i + (s - 1) < right) {
                merge(a, i, i + (s - 1), right);
            }
        }
    }

    private static void merge(int[] data, int p, int q, int r) {
        int[] B = new int[data.length];
        int s = p;
        int t = q + 1;
        int k = p;
        while (s <= q && t <= r) {
            if (data[s] <= data[t]) {
                B[k] = data[s];
                s++;
            } else {
                B[k] = data[t];
                t++;
            }
            k++;
        }
        if (s == q + 1) {
            B[k++] = data[t++];
        } else {
            B[k++] = data[s++];
        }
        for (int i = p; i <= r; i++) {
            data[i] = B[i];
        }
    }
}
