package com.hy.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Depart {
    private Integer id;
    private String departname;

    public Depart(String departname) {
        this.departname = departname;
    }
}