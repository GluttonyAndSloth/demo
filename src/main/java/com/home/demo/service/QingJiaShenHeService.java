package com.home.demo.service;


import com.home.demo.entity.QingJiaShenHe;
import com.home.demo.mapper.QingJiaShenHeMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class QingJiaShenHeService {
    @Resource
    QingJiaShenHeMapper qjshm;
    public List<QingJiaShenHe> select(Map<String,Object> map){
        List<QingJiaShenHe> list=qjshm.select(map);
        return list;
    }
    public  Integer select1(Map<String, Object> map) {
        Integer count = qjshm.select1(map);
        return count;
    }
    public boolean update(Integer q_id){
        return qjshm.update(q_id);
    }
    public boolean update1(Integer q_id){
        return qjshm.update1(q_id);
    }
    public boolean update2(Integer c_id){
        return qjshm.update2(c_id);
    }
}
