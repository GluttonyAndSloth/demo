package com.home.demo.service;


import com.home.demo.entity.Price;
import com.home.demo.mapper.PriceMapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class PriceService {
    @Resource
    PriceMapper priceMapper;
    public List<Price> selectAll(Map<String,Object> map) {
        List<Price> userlist=priceMapper.Selectpageprice(map);
        return userlist;
    }

    public  Integer selectPriceCount(Map<String, Object> map){
        Integer count=priceMapper.selectAllPriceCount(map);
        return count;
    }
    public boolean updatePrice(Price price){
        return priceMapper.updatePrice(price);
    }
    public boolean updatePrice1(String pri_name,String p_price){
        return priceMapper.updatePrice1(pri_name,p_price);
    }

}
