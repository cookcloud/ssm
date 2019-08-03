package com.hy.controller;

import com.alibaba.fastjson.JSONObject;
import com.hy.bean.Depart;
import com.hy.bean.EnumDepartStatus;
import com.hy.service.DepartService;
import net.sf.jsqlparser.expression.JsonExpression;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class DepartController {

    @Autowired
    private DepartService departService;

    @RequestMapping("/getDepart")
    @ResponseBody
    public ModelAndView getDepart() {
        List<Depart> departList = departService.getDepart();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("departList", departList);
        modelAndView.setViewName("departList");
        return modelAndView;
    }

    @RequestMapping("/getDepartListByParameter")
    @ResponseBody
    public List<Depart> getDepartListByParameter(int pageNum, int pageSize) {

        List<Depart> departList = departService.getDepartListByParameter(pageNum, pageSize);
        return departList;
    }


    //批量插入数据测
    @RequestMapping("/batchInsertDepart")
    @ResponseBody
    public List<Integer>  batchInsertDepart() {
        List<Integer>  departPrimaryKyes = departService.batchInsertDepart();
        return departPrimaryKyes;
    }

    //测试自定义的枚举类型，当字段为自定义的枚举类型时使用自定义的typehandler
    @RequestMapping("/insertDepartEnumDepartStatus")
    @ResponseBody
    public EnumDepartStatus insertDepartEnumDepartStatus() {
        EnumDepartStatus enumDepartStatus = departService.insertDepartEnumDepartStatus();
        System.out.println("枚举对象的code==>"+enumDepartStatus.getCode());
        System.out.println("枚举对象的msg==>"+enumDepartStatus.getMsg());
        return enumDepartStatus;
    }
}
