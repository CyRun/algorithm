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
        int low = 0;//数组的开始的位置,左边界
        int high = arr.length - 1;//数组的结束位置,有边界
        while (low <= high) {
            int mid = (low + high) >>> 1;//取数组的中间位置，如果(low+high)为偶数则向下取整
            int guess = arr[mid];//中间位置对应的数
            if (guess == num) {//如果查找的数据与中间位置对应的数相等
                return mid;//返回数组下标
            }
            if (guess > num) {//如果要查找的数比中间的数小
                high = mid - 1;//设为右边界
            } else {
                low = mid + 1;//设为左边界
            }
        }
        return -1;//没有查到到,返回-1
    }

    //问题1.如果low=0,high=Inter.Max_Value-1,使用mid=(low + high) / 2 会产生整数溢出问题
    //解决方法1: low/2+high/2 ====> low+(-low/2+high/2) ====> low+(high-low)/2
    //解决方法2: 使用无符号右移 >>>1
}
