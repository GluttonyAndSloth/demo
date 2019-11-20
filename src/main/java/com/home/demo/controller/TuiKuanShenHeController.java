package com.home.demo.controller;


import com.home.demo.entity.TuiKuaiShenHe;
import com.home.demo.service.TuiKuanShenHeService;
import com.home.demo.util.FenyeResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/tuikuan")
@Controller
public class TuiKuanShenHeController {
    @Resource
    TuiKuanShenHeService tss;
    @RequestMapping("/select")
    @ResponseBody
    public Map<String, Object> select(Integer page, Integer limit) {
        Map<String, Object> map = new HashMap<>();
        map.put("page", (page - 1) * limit);
        map.put("limit", limit);
        List<TuiKuaiShenHe> slist = tss.select(map);
        Integer count = tss.select1(map);
        //System.out.println("查到了啊"+slist);
        //c查询总条数
        return FenyeResult.fenye(slist, count);
    }
    @RequestMapping("/ss")
    public String ss(){
        return "TuiKuanShenHe";
    }
    @RequestMapping("/update")
    @ResponseBody
    public boolean update(Integer o_id,Integer t_id,Integer id,String o_total){
        tss.update(o_id);
        tss.update1(t_id);
        tss.update2(id,o_total);
        return true;
    }

}
