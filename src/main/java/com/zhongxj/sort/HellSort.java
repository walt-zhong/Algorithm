package com.zhongxj.sort;

import java.util.Arrays;

/**
 * 希尔排序
 */
public class HellSort implements ISort{
    @Override
    public int[] sortArr(int[] srcArr) {
        int len = srcArr.length;
        // 按照增量分组后，每个分组中，temp代表当前待排序的数据
        // gap指的是分组的增量，依次递减

        int currentValue,gap = len/2;
        while(gap > 0){
            for (int i = gap; i < len; i++) {
                currentValue = srcArr[i];
                // 组内已经被排序的数据的索引
                int preIndex = i - gap;
                // 在组内已经排过序的数据中倒序寻找合适的位置，如果当前待排序的数据小于比较的元素
                // 则将比较的元素在组内后移一位

                while (preIndex >=0 && srcArr[preIndex] > currentValue){
                    srcArr[preIndex + gap] = srcArr[preIndex];
                    preIndex -= gap;
                }
                // 当while循环结束时，说明已经找到了当前待排序数据的合适位置，插入即可
                srcArr[preIndex + gap] = currentValue;
            }

            System.out.println("本轮增量[" + gap + "]");
            System.out.println("排序后的数组: " + Arrays.toString(srcArr));
            System.out.println("=======================================");
            gap /= 2;
        }
        return srcArr;
    }
}
