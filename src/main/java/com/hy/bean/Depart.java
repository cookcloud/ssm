package com.hy.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Depart  implements Serializable{

    private static final long serialVersionUID = 565819704401014608L;
    private Integer id;
    private String departname;
    private EnumDepartStatus departstatus;  //自定义的枚举类型  例如，这里字段值默认是LOGIN==》 private EnumDepartStatus departstatus=EnumDepartStatus.LOGIN;

    public Depart(String departname, EnumDepartStatus departstatus) {
        this.departname = departname;
        this.departstatus = departstatus;
    }

    public Depart(String departname) {
        this.departname = departname;
    }
}