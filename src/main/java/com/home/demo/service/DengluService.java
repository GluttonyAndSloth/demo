package com.home.demo.service;

import com.home.demo.entity.baojieshi;
import com.home.demo.entity.dingdan;
import com.home.demo.entity.quanxian;
import com.home.demo.entity.user;
import com.home.demo.mapper.DengluMapper;
import com.home.demo.util.PageVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DengluService {
    @Resource
    DengluMapper dengluMapper;
    public user selectuser(String u_name){
        return dengluMapper.selectuser(u_name);
    }
    public List<quanxian> selectzq(String u_name){
        return dengluMapper.selectzq(u_name);
    }
    public List<quanxian> selectcq(String u_name){
        return dengluMapper.selectcq(u_name);
    }
    public int selectbjss(baojieshi baojie) {
        // TODO Auto-generated method stub
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("c_name",baojie.getC_name());
        return dengluMapper.selectbjss(map);
    }
    public List<baojieshi> selectbjsxx(PageVo pageVo, baojieshi baojie) {
        // TODO Auto-generated method stub
        int begin = pageVo.getLimit()*(pageVo.getPage()-1);;
        int end = pageVo.getLimit();
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("begin", begin);
        map.put("end", end);
        map.put("c_name",baojie.getC_name());
        return dengluMapper.selectbjsxx(map);
    }
/*    public int xgbjszt(baojieshi baojie){
        return dengluMapper.xgbjszt(baojie);
    };*/
public int selectbdws() {
    // TODO Auto-generated method stub

    return dengluMapper.selectbdws();
}
    public List<dingdan> selectdbwxx(PageVo pageVo, dingdan ding) {
        // TODO Auto-generated method stub
        int begin = pageVo.getLimit()*(pageVo.getPage()-1);;
        int end = pageVo.getLimit();
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("begin", begin);
        map.put("end", end);
        return dengluMapper.selectdbwxx(map);
    }
    public int selectbdjs() {
        // TODO Auto-generated method stub

        return dengluMapper.selectbdjs();
    }
    public List<dingdan> selectdbjxx(PageVo pageVo, dingdan ding) {
        // TODO Auto-generated method stub
        int begin = pageVo.getLimit()*(pageVo.getPage()-1);;
        int end = pageVo.getLimit();
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("begin", begin);
        map.put("end", end);
        return dengluMapper.selectdbjxx(map);
    }
    public int selectfwrs(baojieshi baojie) {
        // TODO Auto-generated method stub
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("c_address",baojie.getC_address());
        return dengluMapper.selectfwrs(map);
    }
    public List<baojieshi> selectfwrxx(PageVo pageVo, baojieshi baojie) {
        // TODO Auto-generated method stub
        int begin = pageVo.getLimit()*(pageVo.getPage()-1);;
        int end = pageVo.getLimit();
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("begin", begin);
        map.put("end", end);
        map.put("c_address",baojie.getC_address());
        return dengluMapper.selectfwrxx(map);
    }
    public int pqfwry(dingdan ding){
        return dengluMapper.pqfwry(ding);
    };
}
