package com.home.demo.mapper;

import com.home.demo.entity.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface DengluMapper {
    user selectuser(String u_name);
    List<quanxian> selectzq(String u_name);
    List<quanxian> selectcq(String u_name);
    int selectbjss(Map<String, Object> map);
    List<baojieshi> selectbjsxx(Map<String, Object> map);
/*    public int xgbjszt(baojieshi baojie);*/
int selectbdws();
    List<dingdan> selectdbwxx(Map<String, Object> map);
    int selectbdjs();
    List<dingdan> selectdbjxx(Map<String, Object> map);
    int selectfwrs(Map<String, Object> map);
    List<baojieshi> selectfwrxx(Map<String, Object> map);
    int pqfwry(dingdan ding);
    int bjszt(baojieshi baojie);
    int selectbdcjs();
    List<dingdan> selectdbjcxx(Map<String, Object> map);
    int selectbdqjs();
    List<dingdan> selectdbjqxx(Map<String, Object> map);
    String selectbjsxm(Integer c_id);
    List<pingjia> selectpjxx(Integer c_id);
    public int bjsjin(baojieshi baojie);
    public int bjsqi(baojieshi baojie);
    public int bjsxiao(baojieshi baojie);

    int selectygs(Map<String, Object> map);
    List<user> selectygxx(Map<String, Object> map);

    public int ygjin(user user);
    public int ygqi(user user);
    public int ygxiao(user user);

    List<user> selectgygxx(Integer u_id);
    List<user> selectgygzw(@Param("r_id") Integer r_id);

    int ygzwxg(urlian urlian);
}
