package com.home.demo.controller;

import com.home.demo.entity.baojieshi;
import com.home.demo.entity.quanxian;
import com.home.demo.entity.user;
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
            return "ss";
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
    @RequestMapping("xgbjszt")
    @ResponseBody
    public Object xgbjszt( baojieshi baojie) {
      int ss=dengluService.xgbjszt(baojie);
      if(ss>0){
          return "dd";
      }else {
          return "ss";
      }

    }
}
