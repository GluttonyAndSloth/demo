package com.home.demo.service;



import com.home.demo.mapper.ShouYeMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class ShouYeService {
    @Resource
    ShouYeMapper sym;
    public int select(){
        return sym.select();
    }
    public int select1(){
        return sym.select1();
    }
    public int select2(){
        return sym.select2();
    }
    public int select3(){
        return sym.select3();
    }
}
