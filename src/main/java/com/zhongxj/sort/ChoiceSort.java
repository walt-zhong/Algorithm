package com.zhongxj.sort;

public class ChoiceSort implements ISort{
    @Override
    public int[] sortArr(int[] srcArr) {
        if(srcArr.length == 0){
            return srcArr;
        }

        for (int i = 0; i < srcArr.length; i++) {
            int minIndex = i; // 最小数的下标，每次循环总是假设第一个数最小
            for (int j = i; j < srcArr.length; j++) {
                if(srcArr[j]<srcArr[minIndex]){
                    minIndex = j;
                }

                System.out.println("最小数为: " + srcArr[minIndex]);
                int temp = srcArr[minIndex];
                srcArr[minIndex] = srcArr[i];
                srcArr[i] = temp;
                System.out.println("===========================");
            }
        }

        return srcArr;
    }
}
