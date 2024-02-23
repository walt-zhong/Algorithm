package com.zhongxj.sort;

import java.util.Arrays;

public class QuickSort implements ISort{
    @Override
    public int[] sortArr(int[] srcArr) {
        return sort(srcArr,0,srcArr.length-1);
    }

    private int[] sort(int [] arr,int start,int end){
        if(arr.length<1 || start < 0 || end >= arr.length || start > end){
            return null;
        }

        int zoneIndex = partition(arr,start,end);
        if(zoneIndex > start){
            sort(arr,start,zoneIndex-1);
        }
        if(zoneIndex < end){
            sort(arr,zoneIndex+1,end);
        }

        System.out.println("本轮排序后的数组");
        System.out.println(Arrays.toString(arr));
        System.out.println("========end============");
        return arr;
    }

    private int partition(int[] arr,int start, int end){
        // 只有一个元素时，无需再分区
        if(start == end){
            return start;
        }

        // 随机选择一个基准数
        int pivot = (int)(start+Math.random() * (end-start+1));

        // zoneIndex 为分区指示器，初始值为分区头元素下标减一
        int zoneIndex = start - 1;
        System.out.println("开始下标: " + start + " ,结束下标: " + end
        + " ,基准数下标: " + pivot + " ,基准数下标对应元素值: " + arr[pivot]
        + " , 分区指示器下标: " + zoneIndex);

        // 将基准数和分区尾元素交换位置
        swap(arr,pivot,end);

        for (int i = start; i <= end; i++) {
            //当前元素小于等于基准数
            if(arr[i] <= arr[end]){
                // 分区指示器累加
                zoneIndex ++;
                // 当前元素在分区指示器的右边时，交换当前元素和分区指示器元素
                if(i>zoneIndex){
                    swap(arr,i,zoneIndex);
                }
            }
            System.out.println("分区指示器: " + zoneIndex + " ,遍历指示器: " + i);
            System.out.println(Arrays.toString(arr));
        }
        System.out.println("==================================");
        return zoneIndex;

    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
