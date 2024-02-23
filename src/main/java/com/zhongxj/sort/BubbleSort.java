package com.zhongxj.sort;

import java.util.Arrays;

public class BubbleSort implements ISort{

    @Override
    public int[] sortArr(int[] srcArr) {
        if(srcArr.length == 0){
            return srcArr;
        }

        System.out.println("待排序数组: " + Arrays.toString(srcArr));

        for (int i = 0; i < srcArr.length; i++) {
            for (int j = 0; j < srcArr.length - 1 - i; j++) {
                if (srcArr[j+1] < srcArr[j]){
                    int tmp = srcArr[j+1];
                    srcArr[j+1] = srcArr[j];
                    srcArr[j] = tmp;
                }
            }

            System.out.println("=====================第" +(i+1)+ "轮");
            System.out.println(Arrays.toString(srcArr));
        }

        return srcArr;
    }
}
