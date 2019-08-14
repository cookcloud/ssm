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

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/**
 * @author liudongwei
 * @version V
 * @Type Test1
 * @Desc
 * @date 2019年08月12日 9:41
 */
public class Test1 {

    //
    public static void main(String[] args) {
        System.out.println("xing zeng ");


        List<? extends Serializable> list = Arrays.asList(1, "1");

        List<String> strings = Arrays.asList("a", "b", "c");


    }


}
