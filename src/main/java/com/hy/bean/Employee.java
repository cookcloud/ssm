package com.hy.bean;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Data
public class Employee implements Serializable{


    private static final long serialVersionUID = 1L;
    private Integer id;
    private String lastName;
    private String email;
    private String gender;

    public Employee() {
    }

    public Employee(Integer id, String lastName, String email, String gender) {
        this.id = id;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
