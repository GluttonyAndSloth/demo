package com.home.demo.controller;


import com.home.demo.entity.Fuwufanwei;
import com.home.demo.entity.Project;
import com.home.demo.service.FuwuService;
import com.home.demo.util.FenyeResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("fuwu")
public class FuwuController {
    @Autowired
    private FuwuService fuwuService;
    @RequestMapping("/select")
    @ResponseBody
    public Map<String,Object> select(Integer page, Integer limit, Fuwufanwei fuwufanwei){
        Map<String,Object> map =new HashMap<>();
        map.put("page",(page-1)*limit);
        map.put("limit",limit);
        map.put("p_name",fuwufanwei.getP_name());
        List<Fuwufanwei> userList = fuwuService.selectAll(map);
        Integer count = fuwuService.selectfuwuCount(map);
       // System.out.println("查到了啊"+userList);
        //c查询总条数
        return FenyeResult.fenye(userList,count);
    }
    @RequestMapping("selectfuwu")
    public String tiaoyiao(){
        return "fuwufanwei";
    }
    @RequestMapping("updateFuwu")
    @ResponseBody
    public Boolean updateFuwu(Fuwufanwei fuwufanwei){
        fuwuService.updateFuwu(fuwufanwei);
        return true;
    }
    @RequestMapping("addFuwu")
    @ResponseBody
    public Boolean addFuwu(String sf_name,String p_name){
        Integer p_id = fuwuService.selectProject(p_name);
        System.out.println(p_id);
        fuwuService.addFuwu(sf_name,p_id);
        return true;
    }
    @RequestMapping("deleteFuwu")
    @ResponseBody
    public Boolean delete(Fuwufanwei fuwufanwei){
        fuwuService.delete(fuwufanwei);
        return true;
    }
    @RequestMapping("selectProject")
    @ResponseBody
    public List<Project> selectPro(Project project){
        Map<String,Object> map =new HashMap<>();
        List<Project> list=fuwuService.selectPro();
        //System.out.println(list);
        return  list;
    }


}
