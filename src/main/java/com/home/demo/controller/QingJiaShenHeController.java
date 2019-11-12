package com.home.demo.controller;


import com.home.demo.entity.QingJiaShenHe;
import com.home.demo.service.QingJiaShenHeService;
import com.home.demo.util.FenyeResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/qingjia")
@Controller
public class QingJiaShenHeController {
    @Autowired
    private QingJiaShenHeService qingJiaShenHeService;
    @RequestMapping("/select")
    @ResponseBody
    public Map<String, Object> select(Integer page, Integer limit) {
        Map<String, Object> map = new HashMap<>();
        map.put("page", (page - 1) * limit);
        map.put("limit", limit);
        List<QingJiaShenHe> slist = qingJiaShenHeService.select(map);
        Integer count = qingJiaShenHeService.select1(map);
        //System.out.println("查到了啊"+slist);
        //c查询总条数
        return FenyeResult.fenye(slist, count);
    }
    @RequestMapping("/ss")
    public String ss(){
        return "QingJiaShenHe";
    }
    @RequestMapping("/update")
    @ResponseBody
    public boolean update(Integer q_id,Integer c_id){
        qingJiaShenHeService.update(q_id);
        qingJiaShenHeService.update2(c_id);
        return true;
    }
    @RequestMapping("/update1")
    @ResponseBody
    public boolean update1(Integer q_id){
        qingJiaShenHeService.update1(q_id);
        return true;
    }
    @RequestMapping("/update2")
    @ResponseBody
    public boolean update2(Integer q_id){
        qingJiaShenHeService.update(q_id);
        return true;
    }
}
