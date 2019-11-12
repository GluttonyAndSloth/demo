package com.home.demo.mapper;




import com.home.demo.entity.RuZhuShenHe;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface RuZhuShenHeMapper {
    public List<RuZhuShenHe> select(Map<String, Object> map);
    Integer select1(Map<String, Object> map);
    public boolean update(Integer r_id);
    public boolean addupdate(Integer r_id);
    public boolean add(RuZhuShenHe shenhe);
}
