package com.hy.service.serviceImp;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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

    @Override
    public List<Depart> getDepartListByParameter(int pageNum, int pageSize) {

        Page<Object> page = PageHelper.startPage(pageNum, pageSize);
        List<Depart> departList = departMapper.selectAll();
        System.out.println("总页数===>"+page.getPages());
        System.out.println("页数===>"+page.getPageNum());
        System.out.println("每页行数（记录数）===>"+page.getPageSize());
        System.out.println("总记录数===>"+page.getTotal());

        //为了获取到更详细的页码信息，这里可以将departList信息包装到PageInfo中
        PageInfo<Depart> pageInfo = new PageInfo<>(departList);
        System.out.println(pageInfo.getPageNum());
        System.out.println(pageInfo.getSize());
        return departList;
    }


}
