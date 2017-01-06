package com.java.array;

import java.util.Arrays;

/**
 * Created by Administrator on 2017/1/6.
 */
public class ArrayCopy {

    public static void main(String[] args){
        int[] ids = {1,2,3,4,5};
        int[] ids1 = new int[10];
        /** 源数组,源数组中的起始位置,目标数组,目标数据中的起始位置,要复制的源数组元素的数量*/
        System.arraycopy(ids,1,ids1,1,3);
        System.out.println(Arrays.toString(ids1));
       /* [0, 3, 4, 0, 0, 0, 0, 0, 0, 0]*/
        /*拉姆拉表达式*/
       Runnable runnable = ()->System.out.println("Hello Java8");
       runnable.run();
    }
}
