package com.home.demo.mapper;


import com.home.demo.entity.Price;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface PriceMapper {
    //查询所有的方法
    //alt+ enter
    public List<Price> Selectpageprice(Map<String, Object> map);
    //查询条数
    public Integer selectAllPriceCount(Map<String, Object> map);
    //修改
    public boolean updatePrice(Price price);
    public boolean updatePrice1(String pri_name,String p_price);
}
