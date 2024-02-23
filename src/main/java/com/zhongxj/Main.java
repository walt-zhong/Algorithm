package com.zhongxj;

import com.zhongxj.sort.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] srcArr = new int[]{
                1,3,2,4,2,5,7,1,10
        };

        // 冒泡排序
        System.out.println("================冒泡排序======================");
        int[] bubbleRes = new BubbleSort().sortArr(srcArr);
        System.out.println("sort result: " + Arrays.toString(bubbleRes));
        System.out.println("*********************************************");

        System.out.println("================快速排序======================");
        // 快速排序
        int[] quickRes = new QuickSort().sortArr(srcArr);
        System.out.println("quick sort res: " + Arrays.toString(quickRes));

        System.out.println("*********************************************");

        System.out.println("================选择排序======================");
        // 选择排序
        int[] choiceRes = new ChoiceSort().sortArr(srcArr);
        System.out.println("choice sort res: " + Arrays.toString(choiceRes));
        System.out.println("*********************************************");

        System.out.println("================希尔排序======================");
        // 希尔排序
        int [] hellRes = new HellSort().sortArr(srcArr);
        System.out.println("hell sort res: " + Arrays.toString(hellRes));
        System.out.println("*********************************************");

        System.out.println("================插入排序======================");
        int [] insertRes = new InsertSort().sortArr(srcArr);
        System.out.println("insert sort res: " + Arrays.toString(insertRes));
        System.out.println("*********************************************");

    }
}