package com.hy.service.serviceImp;

import com.alibaba.fastjson.JSONObject;
import com.hy.bean.Depart;
import com.hy.mapper.DepartMapper;
import com.hy.service.DepartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartServiceImp implements DepartService {
    @Autowired
    private DepartMapper departMapper;

    @Override
    public List<Depart> getDepart() {
        List<Depart> departList = departMapper.selectAll();
        return departList;
    }
}
