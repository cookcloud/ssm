package com.hy.service;

import com.alibaba.fastjson.JSONObject;
import com.hy.bean.Depart;

import java.util.List;

public interface DepartService {
    public List<Depart> getDepart();

    public List<Depart> getDepartListByParameter(int pageNum, int pageSize);
}
