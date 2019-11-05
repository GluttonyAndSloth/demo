package com.home.demo.mapper;

import com.home.demo.entity.baojieshi;
import com.home.demo.entity.quanxian;
import com.home.demo.entity.user;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface DengluMapper {
    public user selectuser(String u_name);
    public List<quanxian> selectzq(String u_name);
    public List<quanxian> selectcq(String u_name);
    public int selectbjss(Map<String, Object> map);
    public List<baojieshi> selectbjsxx(Map<String,Object> map);
    public int xgbjszt(baojieshi baojie);
}
