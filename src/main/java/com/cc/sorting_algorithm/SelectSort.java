package com.cc.sorting_algorithm;

import java.util.Arrays;

/**
 * @author CyRun
 * Date：2022/6/9 17:56
 * @version 1.0
 * Description：选择排序
 * 1.将数组分为两个子集,排序的和未排序的,每一轮从未排序的子集中选出最小的元素,放入排序子集
 * 2.重复以上步骤,直到整个数组有序
 */
public class SelectSort {

    public void selectSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            //最小值索引
            int minIndex = i;
            //假定第一为最小值
            int min = arr[i];
            //从第一个元素后面开始找,遍历后面的所有元素
            for (int j = i + 1; j < arr.length; j++) {
                //说明假定的最小值,并不是最小
                if (min > arr[j]) {
                    //重置最小值
                    min = arr[j];
                    //重置最小值的索引
                    minIndex = j;
                }
            }
            //将最小值放在arr[i],即交换
            if (minIndex != i) {
                arr[minIndex] = arr[i];
                arr[i] = min;
            }
            /*System.out.println("第"+(i+1)+"轮后==>");
            System.out.println(Arrays.toString(arr));*/
        }
        System.out.println(Arrays.toString(arr));

    }
}
//80000条数据排序时间测试
    /*int[] arr = new int[80000];
        for(int i=0;i< 80000;i++){
        arr[i]=(int)(Math.random()*8000000);//生成一个[0,80000]的数组
        }

        Date date1=new Date();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date1Str=simpleDateFormat.format(date1);
        System.out.println("排序前时间:"+date1Str);

        SelectSort selectSort=new SelectSort();
        selectSort.selectSort(arr);

        Date date2=new Date();
        String date2Str=simpleDateFormat.format(date2);
        System.out.println("排序后时间:"+date2Str);*/
