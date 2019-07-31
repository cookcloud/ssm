package com.hy.mapper;

import com.hy.bean.Depart;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface DepartMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Depart record);

    Depart selectByPrimaryKey(Integer id);

    List<Depart> selectAll();

    int updateByPrimaryKey(Depart record);
}