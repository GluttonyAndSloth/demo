package com.home.demo.service;


import com.home.demo.entity.Fuwufanwei;
import com.home.demo.entity.Project;
import com.home.demo.entity.user;
import com.home.demo.mapper.FuwufanweiMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class FuwuService {
    @Resource
    FuwufanweiMapper fuwufanweiMapper;
    public List<Fuwufanwei> selectAll(Map<String,Object> map) {
        List<Fuwufanwei> userlist=fuwufanweiMapper.Selectpagefuwu(map);
        return userlist;
    }

    public  Integer selectfuwuCount(Map<String, Object> map){
        Integer count=fuwufanweiMapper.selectAllFuwuCount(map);
        return count;
    }
    public boolean updateFuwu(Fuwufanwei fuwufanwei){
        return fuwufanweiMapper.updateFuwu(fuwufanwei);
    }
    public boolean addFuwu(String sf_name,Integer p_id){
        return fuwufanweiMapper.addFuwu(sf_name,p_id);
    }
    public Integer selectProject(String p_name){return fuwufanweiMapper.selectProject(p_name);}
    public boolean delete(Fuwufanwei fuwufanwei){return fuwufanweiMapper.delete(fuwufanwei);}
    public List<Project> selectPro(){return  fuwufanweiMapper.selectPro();}
   public  List<user> finduser(String u_name){return fuwufanweiMapper.finduser(u_name);};
    public boolean updateuser(user user){return  fuwufanweiMapper.updateuser(user);}
}
