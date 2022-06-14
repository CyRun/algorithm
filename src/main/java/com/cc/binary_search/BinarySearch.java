package com.cc.binary_search;

import org.jetbrains.annotations.NotNull;

/**
 * @author CyRun
 * Date：2022/6/9 8:40
 * @version 1.0
 * Description：二分查找(一定是有序的！！！) 时间复杂度(log2n)
 */
public class BinarySearch {
    public int binarySearch(@NotNull int[] arr, int num) {
        //数组的开始的位置,左边界
        int low = 0;
        //数组的结束位置,有边界
        int high = arr.length - 1;
        while (low <= high) {
            //取数组的中间位置，如果(low+high)为偶数则向下取整
            int mid = (low + high) >>> 1;
            //中间位置对应的数
            int guess = arr[mid];
            //如果查找的数据与中间位置对应的数相等
            if (guess == num) {
                //返回数组下标
                return mid;
            }
            //如果要查找的数比中间的数小
            if (guess > num) {
                //设为右边界
                high = mid - 1;
            } else {
                //设为左边界
                low = mid + 1;
            }
        }
        //没有查到到,返回-1
        return -1;
    }
//    BinarySearch binarySearch = new BinarySearch();
//    int i = binarySearch.binarySearch(arr, 9);
//    System.out.println(i);

    //问题1.如果low=0,high=Inter.Max_Value-1,使用mid=(low + high) / 2 会产生整数溢出问题
    //解决方法1: low/2+high/2 ====> low+(-low/2+high/2) ====> low+(high-low)/2
    //解决方法2: 使用无符号右移 >>>1
}
