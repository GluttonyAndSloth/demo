package com.home.demo.controller;


import com.home.demo.entity.LiZhiShenHe;
import com.home.demo.service.LiZhiShenHeService;
import com.home.demo.util.FenyeResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/lizhi")
@Controller
public class LiZhiShenHeController {
        @Autowired
        private LiZhiShenHeService liZhiShenHeService;
        @RequestMapping("/select")
        @ResponseBody
        public Map<String, Object> select(Integer page, Integer limit) {
            Map<String, Object> map = new HashMap<>();
            map.put("page", (page - 1) * limit);
            map.put("limit", limit);
            List<LiZhiShenHe> slist = liZhiShenHeService.select(map);
            Integer count = liZhiShenHeService.select1(map);
            //System.out.println("查到了啊"+slist);
            //c查询总条数
            return FenyeResult.fenye(slist, count);
        }
        @RequestMapping("/ss")
        public String ss(){
            return "liZhiShenHe";
        }
        @RequestMapping("/update")
        @ResponseBody
        public boolean update(Integer l_id,Integer c_id){
            liZhiShenHeService.update(l_id);
            liZhiShenHeService.update2(c_id);
            return true;
        }
        @RequestMapping("/update1")
        @ResponseBody
        public boolean update1(Integer l_id){
            liZhiShenHeService.update1(l_id);
            return true;
        }
    @RequestMapping("/update2")
    @ResponseBody
    public boolean update2(Integer l_id){
        liZhiShenHeService.update(l_id);
        return true;
    }
}
