package com.home.demo.controller;

import com.home.demo.entity.*;
import com.home.demo.service.DengluService;
import com.home.demo.util.PageUtil;
import com.home.demo.util.PageVo;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class dengluController {
    @Resource
    DengluService dengluService;
@RequestMapping("denglu")
    public String denlu(){
    return "denglu";
}
    @ResponseBody
    @RequestMapping("chayong")
    public Object chayong(String u_name, String u_password, Model model, HttpSession session){
        user user=dengluService.selectuser(u_name);
        System.out.println(u_name+"+"+u_password);
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(u_name,u_password);
        try {
            subject.login(token);
            session.setAttribute("nnn",u_name);
            session.setAttribute("zw",user.getR_id());
            System.out.println(user.getU_status());
            if(user.getU_status().equals("正常")){
                return "ss";
            }else {
                return "meiquan";
            }
        } catch (IncorrectCredentialsException e) {

            return "mima";
        }catch (UnknownAccountException e) {

            return "name";
        }
    }
    @RequestMapping("shouye")
    public String shouye(){
        return "text";
    }
    @RequestMapping("cc")
    public String cc(Model model,HttpSession session){
     String name=session.getAttribute("nnn").toString();
    List<quanxian> zq=dengluService.selectzq(name);
    List<quanxian> cq=dengluService.selectcq(name);
        model.addAttribute("Zq",zq);
        model.addAttribute("Cq",cq);
        model.addAttribute("AAA",name);
    return "shouye";
    }
    @RequestMapping("zhuye")
public String zhuye(){
    return "zhuye";
}
    @RequestMapping("baojieshiguanli")
    public String baojieshiguanli(){
        return "baojieshiguanli";
    }
    @RequestMapping("selectbjsxx")
    @ResponseBody
    public Object selectgongsixixi(PageVo pagevo, baojieshi baojie) {
        if (baojie.getC_name() != null && baojie.getC_name() != "") {
            String sss = "%" + baojie.getC_name() + "%";
            baojie.setC_name(sss);
        } else {
            baojie.setC_name("");
        }
        System.out.println(baojie.getC_name());
        int s = dengluService.selectbjss(baojie);
        System.out.println(s);
        List<baojieshi> list = dengluService.selectbjsxx(pagevo, baojie);
        System.out.println(list);
        PageUtil pageutil = new PageUtil();
        pageutil.setCount(s);
        pageutil.setCode(0);
        pageutil.setData(list);
        pageutil.setMsg("");
        return pageutil;
    }
    @RequestMapping("gaojishenhe")
    public String gaojishenhe(){
        return "gaojishenhe";
    }
 /*   @RequestMapping("xgbjszt")
    @ResponseBody
    public Object xgbjszt( baojieshi baojie) {
      int ss=dengluService.xgbjszt(baojie);
      if(ss>0){
          return "dd";
      }else {
          return "ss";
      }
    }*/
 @RequestMapping("yuangongguanli")
 public String yuangongguanli(){
     return "yuangongguanli";
 }
    @RequestMapping("weipaidan")
    public String weipaidan(){
        return "weipaidan";
    }
    @RequestMapping("selectdbxx")
    @ResponseBody
    public Object selectdbxx(PageVo pagevo, dingdan ding) {
        int s = dengluService.selectbdws();
        System.out.println(s);
        List<dingdan> list = dengluService.selectdbwxx(pagevo, ding);
        System.out.println(list);
        PageUtil pageutil = new PageUtil();
        pageutil.setCount(s);
        pageutil.setCode(0);
        pageutil.setData(list);
        pageutil.setMsg("");
        return pageutil;
    }
    @RequestMapping("dingdanjinxingzhong")
    public String dingdanjinxingzhong(){
        return "dingdanjinxingzhong";
    }
    @RequestMapping("selectdbjxx")
    @ResponseBody
    public Object selectdbjxx(PageVo pagevo, dingdan ding) {
        int s = dengluService.selectbdjs();
        System.out.println(s);
        List<dingdan> list = dengluService.selectdbjxx(pagevo, ding);
        System.out.println(list);
        PageUtil pageutil = new PageUtil();
        pageutil.setCount(s);
        pageutil.setCode(0);
        pageutil.setData(list);
        pageutil.setMsg("");
        return pageutil;
    }
    @RequestMapping("chapaidanren")
    public String chapaidanren(String o_address,Model model,String o_id){
        System.out.println(o_address);
        System.out.println(o_id);
     model.addAttribute("nnnn",o_address);
        model.addAttribute("mmmm",o_id);
        return "chapaidanren";
    }
    @RequestMapping("selectfwrxx")
    @ResponseBody
    public Object selectfwrxx(PageVo pagevo, baojieshi baojie) {
        if (baojie.getC_address() != null && baojie.getC_address() != "") {
            String sss = "%" + baojie.getC_address() + "%";
            baojie.setC_address(sss);
        } else {
            baojie.setC_address("");
        }
        System.out.println(baojie.getC_address());
        int s = dengluService.selectfwrs(baojie);
        System.out.println(s);
        List<baojieshi> list = dengluService.selectfwrxx(pagevo, baojie);
        System.out.println(list);
        PageUtil pageutil = new PageUtil();
        pageutil.setCount(s);
        pageutil.setCode(0);
        pageutil.setData(list);
        pageutil.setMsg("");
        return pageutil;
    }
    @RequestMapping("dingdanmingxi")
    public String dingdanmingxi(){
        return "yiwanchengdingdan";
    }
    @ResponseBody
    @RequestMapping("paidanren")
    public Object paidanren(dingdan ding, Model model,baojieshi baojie){
        int ss=dengluService.pqfwry(ding);
        baojie.setC_id(ding.getC_id());
        int dd=dengluService.bjszt(baojie);
        if(ss>0){
            return "dd";
        }else {
            return "ss";
        }
    }
    @RequestMapping("selectdbcjxx")
    @ResponseBody
    public Object selectdbcjxx(PageVo pagevo, dingdan ding) {
        int s = dengluService.selectbdcjs();
        System.out.println(s);
        List<dingdan> list = dengluService.selectdbjcxx(pagevo, ding);
        System.out.println(list);
        PageUtil pageutil = new PageUtil();
        pageutil.setCount(s);
        pageutil.setCode(0);
        pageutil.setData(list);
        pageutil.setMsg("");
        return pageutil;
    }
    @RequestMapping("yiquxiaodingdan")
    public String yiquxiaodingdan(){
        return "yiquxiaodingdan";
    }
    @RequestMapping("selectdbqjxx")
    @ResponseBody
    public Object selectdbqjxx(PageVo pagevo, dingdan ding) {
        int s = dengluService.selectbdqjs();
        System.out.println(s);
        List<dingdan> list = dengluService.selectdbjqxx(pagevo, ding);
        for (dingdan dingdan : list) {
            if(dingdan.getC_id()!=null){
dingdan.setC_name(dengluService.selectbjsxm(dingdan.getC_id()));
            }else {
                dingdan.setC_name("尚未派单");
            }
        }
        System.out.println(list);
        PageUtil pageutil = new PageUtil();
        pageutil.setCount(s);
        pageutil.setCode(0);
        pageutil.setData(list);
        pageutil.setMsg("");
        return pageutil;
    }
    @RequestMapping("chakanpingjia")
    public String chakanpingjia(Integer c_id,Model model){
        List<pingjia> zq=dengluService.selectpjxx(c_id);
        int z=0;
        int h=0;
        int c=0;
        for (pingjia pingjia : zq) {
            if(pingjia.getE_ping()>3){
                h++;
            }else {
                c++;
            }
            z++;
        }
        model.addAttribute("zong",z);
        model.addAttribute("hao",h);
        model.addAttribute("cha",c);
        model.addAttribute("pingjia",zq);
     return "chakanpingjia";
    }

    @RequestMapping("bjsjin")
    @ResponseBody
    public Object bjsjin( baojieshi baojie) {
        int ss=dengluService.bjsjin(baojie);
        if(ss>0){
            return "dd";
        }else {
            return "ss";
        }
    }
    @RequestMapping("bjsqi")
    @ResponseBody
    public Object bjsqi( baojieshi baojie) {
        int ss=dengluService.bjsqi(baojie);
        if(ss>0){
            return "dd";
        }else {
            return "ss";
        }
    }
    @RequestMapping("bjsxiao")
    @ResponseBody
    public Object bjsxiao( baojieshi baojie) {
        int ss=dengluService.bjsxiao(baojie);
        if(ss>0){
            return "dd";
        }else {
            return "ss";
        }
    }

    @RequestMapping("selectygxx")
    @ResponseBody
    public Object selectygxx(PageVo pagevo, user user,HttpSession session) {
        if (user.getU_name() != null && user.getU_name() != "") {
            String sss = "%" + user.getU_name() + "%";
            user.setU_name(sss);
        } else {
            user.setU_name("");
        }
        int ss= (int) session.getAttribute("zw");
        user.setR_id(ss);
        System.out.println(user.getU_name());
        int s = dengluService.selectygs(user);
        System.out.println(s);
        List<user> list = dengluService.selectygxx(pagevo, user);
        System.out.println(list);
        PageUtil pageutil = new PageUtil();
        pageutil.setCount(s);
        pageutil.setCode(0);
        pageutil.setData(list);
        pageutil.setMsg("");
        return pageutil;
    }

    @RequestMapping("ygjin")
    @ResponseBody
    public Object ygjin( user user) {
        int ss=dengluService.ygjin(user);
        if(ss>0){
            return "dd";
        }else {
            return "ss";
        }
    }
    @RequestMapping("ygqi")
    @ResponseBody
    public Object ygqi( user user) {
        int ss=dengluService.ygqi(user);
        if(ss>0){
            return "dd";
        }else {
            return "ss";
        }
    }
    @RequestMapping("ygxiao")
    @ResponseBody
    public Object ygxiao( user user) {
        int ss=dengluService.ygxiao(user);
        if(ss>0){
            return "dd";
        }else {
            return "ss";
        }
    }

    @RequestMapping("yuangongtianjia")
    public String yuangongtianjia(){
        return "yuangongtianjia";
    }
    @RequestMapping("zhiweiguanli")
    public String zhiweiguanli(Integer u_id,Model model,HttpSession session){
        List<user> list = dengluService.selectgygxx(u_id);
        int ss= (int) session.getAttribute("zw");
        List<user> list1=dengluService.selectgygzw(ss);
        model.addAttribute("ygxx",list);
        model.addAttribute("ygzw",list1);
        return "zhiweiguanli";
    }
    @RequestMapping("xiugaigangwei")
    @ResponseBody
    public String xiugaigangwei(user user,urlian urlian){
        urlian.setUserid(user.getU_id());
        urlian.setRoleid(user.getR_id());
        int ss=dengluService.ygzwxg(urlian);
        System.out.println(ss);
        if(ss>0){
            return "dd";
        }else {
            return "ss";
        }
    }
}
