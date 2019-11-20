package com.home.demo.mapper;

import com.home.demo.entity.TuiKuaiShenHe;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface TuiKuanShenHeMapper {
    public List<TuiKuaiShenHe> select(Map<String, Object> map);
    Integer select1(Map<String, Object> map);
    public boolean update(Integer o_id);
    public boolean update1(Integer t_id);
    public boolean update2(Integer id, String o_total);
}
