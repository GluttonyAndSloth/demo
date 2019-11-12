package com.home.demo.controller;



import com.home.demo.entity.RuZhuShenHe;
import com.home.demo.service.RuZhuShenHeService;
import com.home.demo.util.FenyeResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/ruzhu")
public class RuZhuShenHeController {
    @Autowired
    private RuZhuShenHeService shenHeService;

    @RequestMapping("/select")
@ResponseBody
    public Map<String, Object> select(Integer page, Integer limit) {
        Map<String, Object> map = new HashMap<>();
        map.put("page", (page - 1) * limit);
        map.put("limit", limit);
        List<RuZhuShenHe> slist = shenHeService.select(map);
        Integer count = shenHeService.select1(map);
        //System.out.println("查到了啊"+slist);
        //c查询总条数
        return FenyeResult.fenye(slist, count);
    }
    @RequestMapping("/ss")
    public String ss(){
        return "RuZhuShenHe";
    }
    @RequestMapping("/update")
    @ResponseBody
    public boolean update(Integer r_id){
        shenHeService.update(r_id);

        return true;
    }
    @RequestMapping("/addupdate")
    @ResponseBody
    public boolean addupdate(Integer r_id, RuZhuShenHe shenhe){
        shenHeService.addupdate(r_id);
        shenHeService.add(shenhe);
        return true;
    }

}
