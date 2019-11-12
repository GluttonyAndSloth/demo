package com.home.demo.mapper;


import com.home.demo.entity.QingJiaShenHe;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface QingJiaShenHeMapper {
    public List<QingJiaShenHe> select(Map<String, Object> map);
    Integer select1(Map<String, Object> map);
    public boolean update(Integer q_id);
    public boolean update1(Integer q_id);
    public boolean update2(Integer c_id);
}

