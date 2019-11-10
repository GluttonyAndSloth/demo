package com.home.demo.service;

import com.home.demo.entity.*;
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
        int begin = pageVo.getLimit()*(pageVo.getPage()-1);
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
        int begin = pageVo.getLimit()*(pageVo.getPage()-1);
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
        int begin = pageVo.getLimit()*(pageVo.getPage()-1);
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
        int begin = pageVo.getLimit()*(pageVo.getPage()-1);
        int end = pageVo.getLimit();
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("begin", begin);
        map.put("end", end);
        map.put("c_address",baojie.getC_address());
        return dengluMapper.selectfwrxx(map);
    }
    public int pqfwry(dingdan ding){
        return dengluMapper.pqfwry(ding);
    }

    public int bjszt(baojieshi baojie){
        return dengluMapper.bjszt(baojie);
    }

    public int selectbdcjs() {
        // TODO Auto-generated method stub

        return dengluMapper.selectbdcjs();
    }
    public List<dingdan> selectdbjcxx(PageVo pageVo, dingdan ding) {
        // TODO Auto-generated method stub
        int begin = pageVo.getLimit()*(pageVo.getPage()-1);
        int end = pageVo.getLimit();
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("begin", begin);
        map.put("end", end);
        return dengluMapper.selectdbjcxx(map);
    }
    public int selectbdqjs() {
        // TODO Auto-generated method stub

        return dengluMapper.selectbdqjs();
    }
    public List<dingdan> selectdbjqxx(PageVo pageVo, dingdan ding) {
        // TODO Auto-generated method stub
        int begin = pageVo.getLimit()*(pageVo.getPage()-1);
        int end = pageVo.getLimit();
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("begin", begin);
        map.put("end", end);
        return dengluMapper.selectdbjqxx(map);
    }
    public String selectbjsxm(Integer c_id) {
        // TODO Auto-generated method stub
        return dengluMapper.selectbjsxm(c_id);
    }
    public List<pingjia> selectpjxx(Integer c_id) {
        // TODO Auto-generated method stub
        return dengluMapper.selectpjxx(c_id);
    }

    public int bjsjin(baojieshi baojie){
        return dengluMapper.bjsjin(baojie);
    };
    public int bjsqi(baojieshi baojie){
        return dengluMapper.bjsqi(baojie);
    };
    public int bjsxiao(baojieshi baojie){
        return dengluMapper.bjsxiao(baojie);
    };

    public int selectygs(user user) {
        // TODO Auto-generated method stub
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("u_name",user.getU_name());
        map.put("r_id",user.getR_id());
        return dengluMapper.selectygs(map);
    }
    public List<user> selectygxx(PageVo pageVo, user user) {
        // TODO Auto-generated method stub
        int begin = pageVo.getLimit()*(pageVo.getPage()-1);
        int end = pageVo.getLimit();
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("begin", begin);
        map.put("end", end);
        map.put("u_name",user.getU_name());
        map.put("r_id",user.getR_id());
        return dengluMapper.selectygxx(map);
    }

    public int ygjin(user user){
        return dengluMapper.ygjin(user);
    };
    public int ygqi(user user){
        return dengluMapper.ygqi(user);
    };
    public int ygxiao(user user){
        return dengluMapper.ygxiao(user);
    };

    public List<user> selectgygxx(Integer u_id) {
        // TODO Auto-generated method stub
        return dengluMapper.selectgygxx(u_id);
    }
    public List<user> selectgygzw(Integer r_id) {
        // TODO Auto-generated method stub
        return dengluMapper.selectgygzw(r_id);
    }

    public int ygzwxg(urlian urlian){
        return dengluMapper.ygzwxg(urlian);
    };
}
