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

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import java.util.Arrays;
import java.util.List;

/**
 * @author liudongwei
 * @version V
 * @Type Test5
 * @Desc
 * @date 2019年08月12日 11:43
 */
public class Test5 {
    public static void main(String[] args) {
        System.out.println("xinajin55");

        String str = "niaho ";
        String str1 = "kk";


        List<String> strings = Arrays.asList(str, str1);
        List<String> strings2 = Arrays.asList(str);

        boolean result = StringUtils.isEmpty(str);
        System.out.println(result);


        String[] strs = new String[] {
            str
        };

        boolean empty = ObjectUtils.isEmpty(strs);
        System.out.println(empty
        );
    }
}
