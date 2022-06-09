package com.cc.sorting_algorithm;

/**
 * @author CyRun
 * Date：2022/6/9 9:36
 * @version 1.0
 * Description：冒泡排序
 */
public class BubbleSort {
    public int[] bubbleSort(int[] arr){
        int temp;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j]>arr[j+1]){
                    temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
}
