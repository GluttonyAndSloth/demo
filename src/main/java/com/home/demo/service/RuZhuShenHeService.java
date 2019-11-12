package com.home.demo.service;



import com.home.demo.entity.RuZhuShenHe;
import com.home.demo.mapper.RuZhuShenHeMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class RuZhuShenHeService {
    @Resource
    private RuZhuShenHeMapper csm;
    public List<RuZhuShenHe> select(Map<String,Object> map){
        List<RuZhuShenHe> slist=csm.select(map);
        return slist;
    }
    public  Integer select1(Map<String, Object> map) {
        Integer count = csm.select1(map);
        return count;
    }
    public  boolean update(Integer r_id) {
        return csm.update(r_id);
    }
    public boolean addupdate(Integer r_id) {
        return csm.addupdate(r_id);
    }
    public boolean add(RuZhuShenHe shenhe) {
        return csm.add(shenhe);
    }
}
