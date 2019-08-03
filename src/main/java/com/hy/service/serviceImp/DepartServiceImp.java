package com.hy.service.serviceImp;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hy.bean.Depart;
import com.hy.bean.EnumDepartStatus;
import com.hy.mapper.DepartMapper;
import com.hy.service.DepartService;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

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
        System.out.println("总页数===>" + page.getPages());
        System.out.println("页数===>" + page.getPageNum());
        System.out.println("每页行数（记录数）===>" + page.getPageSize());
        System.out.println("总记录数===>" + page.getTotal());

        //为了获取到更详细的页码信息，这里可以将departList信息包装到PageInfo中
        PageInfo<Depart> pageInfo = new PageInfo<>(departList);
        System.out.println(pageInfo.getPageNum());
        System.out.println(pageInfo.getSize());
        return departList;
    }

    //批量插入结果
    @Autowired
    private SqlSession sqlSession;
    @Override
    public List<Integer> batchInsertDepart() {
        DepartMapper mapper = sqlSession.getMapper(DepartMapper.class);
        Depart departTemp = null;
        List<Integer> departPrimaryKyes = new ArrayList<>();

        //批量：（预编译sql一次==>设置参数===>10000次===>执行（1次））
        //Parameters: 616c1(String), b(String), 1(String)==>4598
        //非批量：（预编译sql=设置参数=执行）==》10000    10200 即：插入一条数据，执行一条sql语句
        for (int i = 0; i < 3; i++) {
            departTemp = new Depart("cmcc" + UUID.randomUUID().toString().substring(0, 4));
            mapper.insert2(departTemp);
            System.out.println(departTemp.toString());
            int departTemoPrimarykey = departTemp.getId();
            departPrimaryKyes.add(departTemoPrimarykey);
        }

        //SqlSession的关闭无需程序员手动关闭，Spring会自动关闭,所以这里不用sqlSession.commit();
        //配置好的SqlSession将自动完成commit，并在执行完sql之后自动close。
        return departPrimaryKyes;
    }

    @Override
    public EnumDepartStatus insertDepartEnumDepartStatus() {
        Depart depart = new Depart("ddd123",EnumDepartStatus.LOGIN);
        departMapper.insert3(depart);
        int departId = depart.getId();
        Depart insertedDepart = departMapper.selectByPrimaryKey(departId);
        EnumDepartStatus departstatus = insertedDepart.getDepartstatus();
        return departstatus;
    }
}
