package com.home.demo.service;


import com.home.demo.entity.TuiKuaiShenHe;
import com.home.demo.mapper.TuiKuanShenHeMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class TuiKuanShenHeService {
    @Resource
    TuiKuanShenHeMapper tsm;
    public List<TuiKuaiShenHe> select(Map<String,Object> map){
        List<TuiKuaiShenHe> list=tsm.select(map);
        return list;
    }
    public  Integer select1(Map<String, Object> map) {
        Integer count = tsm.select1(map);
        return count;
    }
    public boolean update(Integer o_id){
        return tsm.update(o_id);
    }
    public boolean update1(Integer t_id){
        return tsm.update1(t_id);
    }
    public boolean update2(Integer id,String o_total){
        return tsm.update2(id,o_total);
    }
}
