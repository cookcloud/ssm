package com.hy.bean;


import lombok.Data;

import java.io.Serializable;

@Data
public class Employee implements Serializable {

    private static  final long serialVersionUID=1l;
    private Integer id;
    private String  lastName;
    private String   email;
    private String gender;

}
