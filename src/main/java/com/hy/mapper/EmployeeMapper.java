package com.hy.mapper;

import com.hy.bean.Employee;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface EmployeeMapper {

    public Employee getEmployeeById(Integer id);

    public List<Employee> getEmps();
}
