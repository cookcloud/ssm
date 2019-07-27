package com.hy.controller;

import com.hy.bean.Employee;
import com.hy.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("getemps")
    //Map<String,Object> map是将返回的数据封装进map中，然后将数据返回给页面
    public String emps(Map<String,Object> map) {
        List<Employee> emps = employeeService.getEmps();
        map.put("allEmps", emps);
        return "list"; //这里已经在spring-servlet.xml文件中配置了list,jsp的路径以及后缀名，所以这里直接写跳转页面list,jsp为“list”

    }
}
