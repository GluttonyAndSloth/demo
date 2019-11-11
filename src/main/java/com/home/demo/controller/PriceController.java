package com.home.demo.controller;


import com.home.demo.entity.Price;
import com.home.demo.service.PriceService;
import com.home.demo.util.FenyeResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("price")
public class PriceController {
    @Autowired
    private PriceService priceService;
    @RequestMapping("/select")
    @ResponseBody
    public Map<String,Object> select(Integer page, Integer limit, Price price){
        Map<String,Object> map =new HashMap<>();
        map.put("page",(page-1)*limit);
        map.put("limit",limit);
        map.put("pri_id",price.getPri_id());
        List<Price> userList = priceService.selectAll(map);
        Integer count = priceService.selectPriceCount(map);
         System.out.println("查到了啊"+userList);
        //c查询总条数
        return FenyeResult.fenye(userList,count);
    }
    @RequestMapping("selectPrice")
    public String tiaoyiao(){
        return "price";
    }

    @RequestMapping("updatePrice")
    @ResponseBody
    public Boolean updatePrice(Price price){
        priceService.updatePrice(price);
        return true;
    }


}
