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
    int selectfwrzwid(String si_name);
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
    List<pjtupian> selectpjtp(Integer c_id);
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

    int tianjiayonghu(user user);
    int tianjiayonghuzw(urlian urlian);
    int selectgtjyg();

    List<baojieshi> bjsid(@Param("c_name") String c_name);
    List<baojszd> bjsdzd(Integer c_id);
    List<dingdan> bjsdsydd(Integer c_id);
    List<pingjia> bjsdpjs(Integer c_id);

    int tjbjszd(baojszd baojszd);

    int bjsdzdSL(Map<String, Object> map);
    List<baojszd> bjsdzdxx(Map<String, Object> map);
    List<baojszd> cwsytjxx();
   List<baojszd> cwssytjxx();
   List<dingdan> cwxytjxx();
   List<pingjia> pjs(Integer c_id);
    List<dingdan> jrcwsydd();
    List<quanxian> csyqx(Integer r_id);
    List<user> selectyfdhfdghgxx(@Param("r_id") Integer r_id);
    List<quanxian> czwqx(Integer r_id);
    List<rmlian> cxqx(rmlian rm);
    int tjqx(rmlian ur);
    List<rmlian> cxzqx(rmlian rm);
    int tjzqx(rmlian ur);
    int scqx(rmlian ur);
    int cxzpqx(Integer id);
    List<rmlian> cxzsqx(rmlian rm);
    int sczqx(rmlian ur);
    List<quanxian> cxsyqx(quanxian quan);
}
