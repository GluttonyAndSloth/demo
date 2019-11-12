package com.home.demo.service;


import com.home.demo.entity.LiZhiShenHe;
import com.home.demo.mapper.LiZhiShenHeMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class LiZhiShenHeService {
    @Resource
    LiZhiShenHeMapper lzshm;
    public List<LiZhiShenHe> select(Map<String,Object> map){
        List<LiZhiShenHe> list=lzshm.select(map);
        return list;
    }
    public  Integer select1(Map<String, Object> map) {
        Integer count = lzshm.select1(map);
        return count;
    }
    public boolean update(Integer l_id){
        return lzshm.update(l_id);
    }
    public boolean update1(Integer l_id){
        return lzshm.update1(l_id);
    }
    public boolean update2(Integer c_id){
        return lzshm.update2(c_id);
    }
}
