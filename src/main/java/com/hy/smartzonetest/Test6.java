/*
 * Project: ssm
 *
 * File Created at 2019/8/12
 *
 * Copyright 2016 CMCC Corporation Limited.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * ZYHY Company. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license.
 */

package com.hy.smartzonetest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author liudongwei
 * @version V
 * @Type Test6
 * @Desc
 * @date 2019年08月12日 11:44
 */
public class Test6 {
    public static void main(String[] args) {


        String str = "abc";
        boolean empty = str.isEmpty();
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        long count = integers.stream().filter(i -> juge(i,5)).count();
        System.out.println("设置的过滤条件后的个数==>" + count);

        /*List<Integer> list = integers.stream().filter(i -> juge(i, 5)).collect(Collectors.toList());
        printList(list);*/

        List<Integer> list1 = integers.stream().filter(i -> juge(i, 5)).map(i -> handle(i)).collect(Collectors.toList());
        printList(list1);

       /* List<String> list2 = integers.stream().filter(i -> juge(i, 5)).map(i -> handle2()).collect(Collectors.toList());
        printList(list2);*/


    }

    private static int  handle(Integer i) {
        i = 3 * i;
        return i;
    }

    public static String handle2() {
        return "bb";
    }


    private static <T> void printList(List<T> list) {
        for (T t:list){
            System.out.println("元素索引==>"+list.indexOf(t));
            System.out.println("每一个元素===>"+t);
        }
    }

    public  static boolean juge(Integer a,Integer threshold) {
        if (a>threshold) {
            return true;
        }
        return false;
    }

}
