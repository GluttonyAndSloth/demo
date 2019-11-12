package com.home.demo.mapper;


import com.home.demo.entity.LiZhiShenHe;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface LiZhiShenHeMapper {
    public List<LiZhiShenHe> select(Map<String, Object> map);
    Integer select1(Map<String, Object> map);
    public boolean update(Integer l_id);
    public boolean update1(Integer l_id);
    public boolean update2(Integer c_id);
}
