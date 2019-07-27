package com.hy.service;

import com.hy.bean.Employee;
import com.hy.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    public List<Employee> getEmps() {
        return employeeMapper.getEmps();
    }
}
