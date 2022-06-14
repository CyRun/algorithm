package com.cc;

import com.cc.sorting_algorithm.BubbleSort;
import com.cc.sorting_algorithm.SelectSort;

/**
 * @author CyRun
 * Date：2022/6/9 8:51
 * @version 1.0
 * Description：测试
 */
public class App {
    public static void main(String[] args) {
        int[] arr = {5,3,1,9,7};

        //冒泡排序
//        BubbleSort bubbleSort = new BubbleSort();
//        bubbleSort.bubbleSort(arr);
        //选择排序
        SelectSort selectSort=new SelectSort();
        selectSort.selectSort(arr);
    }
}
