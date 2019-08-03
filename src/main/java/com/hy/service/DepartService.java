package com.hy.service;

import com.alibaba.fastjson.JSONObject;
import com.hy.bean.Depart;
import com.hy.bean.EnumDepartStatus;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface DepartService {
    public List<Depart> getDepart();

    public List<Depart> getDepartListByParameter(int pageNum, int pageSize);

    //通过executorType设置为batch来将批量新增数据
    public List<Integer> batchInsertDepart();

    public EnumDepartStatus insertDepartEnumDepartStatus();
}
