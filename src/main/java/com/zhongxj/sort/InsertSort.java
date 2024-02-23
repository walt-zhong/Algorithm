package com.zhongxj.sort;

import java.util.Arrays;

/**
 * 插入排序
 */
public class InsertSort implements ISort{
    @Override
    public int[] sortArr(int[] srcArr) {
        if(srcArr.length == 0){
            return srcArr;
        }

        int currentValue; // 当前待排序的数据，该元素之前的元素均已经被排序过
        for (int i = 0;i< srcArr.length - 1;i++){
            int preIndex = i; // 已经被排序的数据索引
            currentValue = srcArr[preIndex + 1];
            System.out.println("待排序的元素索引: " + (i+1) + "值为: " + currentValue
            + " , 已经被排序的数据元素索引:" + preIndex);

            // 在已经被排过序的数据中倒序寻找合适的位置，如果当前待排序数据与待比较的数据小，则将待比较的数据后移一位
            while (preIndex >0 && currentValue<srcArr[preIndex]){
                // 将当前元素后移一位
                srcArr[preIndex + 1] = srcArr[preIndex];
                preIndex --;
                System.out.println("当前数组: " + Arrays.toString(srcArr));
            }

            // while循环结束时，说明已经找到了当前待排序数据的合适位置，插入即可
            srcArr[preIndex + 1] = currentValue;
            System.out.println("本轮插入排序后的数组");
            System.out.println(Arrays.toString(srcArr));
            System.out.println("=========================");
        }

        return srcArr;
    }
}
