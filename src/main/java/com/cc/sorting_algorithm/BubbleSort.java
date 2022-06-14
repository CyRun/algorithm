package com.cc.sorting_algorithm;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

/**
 * @author CyRun
 * Date：2022/6/9 9:36
 * @version 1.0
 * Description：冒泡排序
 */
public class BubbleSort {
    public void bubbleSort(@NotNull int[] arr) {
        //排序的轮次
        int n = arr.length - 1;
        int temp;//交换的临时变量
        do {
            //表示最后一次交换索引的位置
            int last = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                    last = i;
                }
            }
            n = last;
        } while (n != 0);
        System.out.println(Arrays.toString(arr));
    }
    //BubbleSort bubbleSort = new BubbleSort();
    //        bubbleSort.bubbleSort(arr);
}
