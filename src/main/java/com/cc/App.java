package com.cc;

import com.cc.binary_search.BinarySearch;
import com.cc.sorting_algorithm.BubbleSort;

import java.util.Arrays;

/**
 * @author CyRun
 * Date：2022/6/9 8:51
 * @version 1.0
 * Description：TODO
 */
public class App {
    public static void main(String[] args) {
        int[] arr = {5, 3, 7, 1, 9};
        BubbleSort bubbleSort = new BubbleSort();
        System.out.println(Arrays.toString(bubbleSort.bubbleSort(arr)));
        BinarySearch binarySearch = new BinarySearch();
        int i = binarySearch.binarySearch(arr, 9);
        System.out.println(i);
    }
}
