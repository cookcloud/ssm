package com.hy.service;

import java.util.List;

import com.hy.bean.Employee;
import com.hy.mapper.EmployeeMapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


@Service
public class EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Autowired
    private SqlSession sqlSession;

    public List<Employee> getEmps(){
        //EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
        return employeeMapper.getEmps();
    }


}
