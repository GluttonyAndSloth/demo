package com.home.demo.controller;

import com.home.demo.entity.*;
import com.home.demo.service.DengluService;
import com.home.demo.service.FuwuService;
import com.home.demo.util.Fujie;
import com.home.demo.util.PageUtil;
import com.home.demo.util.PageVo;
import com.home.demo.util.Zijie;
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
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class dengluController {
    @Resource
    DengluService dengluService;
    @Resource
    FuwuService fuwuService;

    @RequestMapping("denglu")
    public String denlu() {
        return "denglu";
    }

    @ResponseBody
    @RequestMapping("chayong")
    public Object chayong(String u_name, String u_password, Model model, HttpSession session) {
        user user = dengluService.selectuser(u_name);
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(u_name, u_password);
        try {
            subject.login(token);
            session.setAttribute("nnn", u_name);
            session.setAttribute("zw", user.getR_id());
            if (user.getU_status().equals("正常")) {
                return "ss";
            } else {
                return "meiquan";
            }
        } catch (IncorrectCredentialsException e) {

            return "mima";
        } catch (UnknownAccountException e) {

            return "name";
        }
    }

    @RequestMapping("finduser")
    public String finduser(HttpSession session, Model model) {
        String u_name = (String) session.getAttribute("nnn");
        List<user> list = fuwuService.finduser(u_name);
        model.addAttribute("list", list);
        return "gerenxinxi";
    }

    @RequestMapping("shouye")
    public String shouye() {
        return "text";
    }

    @RequestMapping("cc")
    public String cc(Model model, HttpSession session) {
        String name = session.getAttribute("nnn").toString();
        List<quanxian> zq = dengluService.selectzq(name);
        List<quanxian> cq = dengluService.selectcq(name);
        model.addAttribute("Zq", zq);
        model.addAttribute("Cq", cq);
        model.addAttribute("AAA", name);
        return "shouye";
    }

    @RequestMapping("zhuye")
    public String zhuye() {
        return "zhuye";
    }

    @RequestMapping("baojieshiguanli")
    public String baojieshiguanli() {
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
        int s = dengluService.selectbjss(baojie);
        List<baojieshi> list = dengluService.selectbjsxx(pagevo, baojie);
        PageUtil pageutil = new PageUtil();
        pageutil.setCount(s);
        pageutil.setCode(0);
        pageutil.setData(list);
        pageutil.setMsg("");
        return pageutil;
    }

    @RequestMapping("gaojishenhe")
    public String gaojishenhe() {
        return "gaojishenhe";
    }

    @RequestMapping("yuangongguanli")
    public String yuangongguanli() {
        return "yuangongguanli";
    }

    @RequestMapping("weipaidan")
    public String weipaidan() {
        return "weipaidan";
    }

    @RequestMapping("selectdbxx")
    @ResponseBody
    public Object selectdbxx(PageVo pagevo, dingdan ding) {
        int s = dengluService.selectbdws();
        List<dingdan> list = dengluService.selectdbwxx(pagevo, ding);
        PageUtil pageutil = new PageUtil();
        pageutil.setCount(s);
        pageutil.setCode(0);
        pageutil.setData(list);
        pageutil.setMsg("");
        return pageutil;
    }

    @RequestMapping("dingdanjinxingzhong")
    public String dingdanjinxingzhong() {
        return "dingdanjinxingzhong";
    }

    @RequestMapping("selectdbjxx")
    @ResponseBody
    public Object selectdbjxx(PageVo pagevo, dingdan ding) {
        int s = dengluService.selectbdjs();
        List<dingdan> list = dengluService.selectdbjxx(pagevo, ding);
        PageUtil pageutil = new PageUtil();
        pageutil.setCount(s);
        pageutil.setCode(0);
        pageutil.setData(list);
        pageutil.setMsg("");
        return pageutil;
    }

    @RequestMapping("chapaidanren")
    public String chapaidanren(String o_address, Model model, String o_id, String o_name) {
        model.addAttribute("nnnn", o_address);
        model.addAttribute("mmmm", o_id);
        model.addAttribute("name", o_name);
        return "chapaidanren";
    }

    @RequestMapping("selectfwrxx")
    @ResponseBody
    public Object selectfwrxx(PageVo pagevo, baojieshi baojie, String o_name) {
        if (baojie.getC_address() != null && baojie.getC_address() != "") {
            String sss = "%" + baojie.getC_address() + "%";
            baojie.setC_address(sss);
        } else {
            baojie.setC_address("");
        }
        int b = dengluService.selectfwrzwid(o_name);
        int s = dengluService.selectfwrs(baojie, b);
        List<baojieshi> list = dengluService.selectfwrxx(pagevo, baojie, b);
        PageUtil pageutil = new PageUtil();
        pageutil.setCount(s);
        pageutil.setCode(0);
        pageutil.setData(list);
        pageutil.setMsg("");
        return pageutil;
    }

    @RequestMapping("dingdanmingxi")
    public String dingdanmingxi() {
        return "yiwanchengdingdan";
    }

    @ResponseBody
    @RequestMapping("paidanren")
    public Object paidanren(dingdan ding, Model model, baojieshi baojie) {
        int ss = dengluService.pqfwry(ding);
        baojie.setC_id(ding.getC_id());
        int dd = dengluService.bjszt(baojie);
        if (ss > 0) {
            return "dd";
        } else {
            return "ss";
        }
    }

    @RequestMapping("selectdbcjxx")
    @ResponseBody
    public Object selectdbcjxx(PageVo pagevo, dingdan ding) {
        int s = dengluService.selectbdcjs();
        List<dingdan> list = dengluService.selectdbjcxx(pagevo, ding);
        PageUtil pageutil = new PageUtil();
        pageutil.setCount(s);
        pageutil.setCode(0);
        pageutil.setData(list);
        pageutil.setMsg("");
        return pageutil;
    }

    @RequestMapping("yiquxiaodingdan")
    public String yiquxiaodingdan() {
        return "yiquxiaodingdan";
    }

    @RequestMapping("selectdbqjxx")
    @ResponseBody
    public Object selectdbqjxx(PageVo pagevo, dingdan ding) {
        int s = dengluService.selectbdqjs();
        List<dingdan> list = dengluService.selectdbjqxx(pagevo, ding);
        for (dingdan dingdan : list) {
            if (dingdan.getC_id() != null) {
                dingdan.setC_name(dengluService.selectbjsxm(dingdan.getC_id()));
            } else {
                dingdan.setC_name("尚未派单");
            }
        }
        PageUtil pageutil = new PageUtil();
        pageutil.setCount(s);
        pageutil.setCode(0);
        pageutil.setData(list);
        pageutil.setMsg("");
        return pageutil;
    }

    @RequestMapping("chakanpingjia")
    public String chakanpingjia(Integer c_id, Model model) {
        List<pingjia> zq = dengluService.selectpjxx(c_id);
        int z = 0;
        int h = 0;
        int c = 0;
        for (pingjia pingjia : zq) {
            if (pingjia.getE_ping() > 3) {
                h++;
            } else {
                c++;
            }
            z++;
        }
        List<pjtupian> tp = dengluService.selectpjtp(c_id);
        model.addAttribute("zong", z);
        model.addAttribute("hao", h);
        model.addAttribute("cha", c);
        model.addAttribute("pingjia", zq);
        model.addAttribute("tp", tp);
        return "chakanpingjia";
    }

    @RequestMapping("bjsjin")
    @ResponseBody
    public Object bjsjin(baojieshi baojie) {
        int ss = dengluService.bjsjin(baojie);
        if (ss > 0) {
            return "dd";
        } else {
            return "ss";
        }
    }

    @RequestMapping("bjsqi")
    @ResponseBody
    public Object bjsqi(baojieshi baojie) {
        int ss = dengluService.bjsqi(baojie);
        if (ss > 0) {
            return "dd";
        } else {
            return "ss";
        }
    }

    @RequestMapping("bjsxiao")
    @ResponseBody
    public Object bjsxiao(baojieshi baojie) {
        int ss = dengluService.bjsxiao(baojie);
        if (ss > 0) {
            return "dd";
        } else {
            return "ss";
        }
    }

    @RequestMapping("selectygxx")
    @ResponseBody
    public Object selectygxx(PageVo pagevo, user user, HttpSession session) {
        if (user.getU_name() != null && user.getU_name() != "") {
            String sss = "%" + user.getU_name() + "%";
            user.setU_name(sss);
        } else {
            user.setU_name("");
        }
        int ss = (int) session.getAttribute("zw");
        user.setR_id(ss);
        int s = dengluService.selectygs(user);
        List<user> list = dengluService.selectygxx(pagevo, user);
        PageUtil pageutil = new PageUtil();
        pageutil.setCount(s);
        pageutil.setCode(0);
        pageutil.setData(list);
        pageutil.setMsg("");
        return pageutil;
    }

    @RequestMapping("ygjin")
    @ResponseBody
    public Object ygjin(user user) {
        int ss = dengluService.ygjin(user);
        if (ss > 0) {
            return "dd";
        } else {
            return "ss";
        }
    }

    @RequestMapping("ygqi")
    @ResponseBody
    public Object ygqi(user user) {
        int ss = dengluService.ygqi(user);
        if (ss > 0) {
            return "dd";
        } else {
            return "ss";
        }
    }

    @RequestMapping("ygxiao")
    @ResponseBody
    public Object ygxiao(user user) {
        int ss = dengluService.ygxiao(user);
        if (ss > 0) {
            return "dd";
        } else {
            return "ss";
        }
    }

    @RequestMapping("yuangongtianjia")
    public String yuangongtianjia(Model model, HttpSession session) {
        int ss = (int) session.getAttribute("zw");
        List<user> list1 = dengluService.selectgygzw(ss);
        model.addAttribute("ygzw", list1);
        return "yuangongtianjia";
    }

    @RequestMapping("zhiweiguanli")
    public String zhiweiguanli(Integer u_id, Model model, HttpSession session) {
        List<user> list = dengluService.selectgygxx(u_id);
        int ss = (int) session.getAttribute("zw");
        List<user> list1 = dengluService.selectgygzw(ss);
        model.addAttribute("ygxx", list);
        model.addAttribute("ygzw", list1);
        return "zhiweiguanli";
    }

    @RequestMapping("xiugaigangwei")
    @ResponseBody
    public String xiugaigangwei(user user, urlian urlian) {
        urlian.setUserid(user.getU_id());
        urlian.setRoleid(user.getR_id());
        int ss = dengluService.ygzwxg(urlian);
        if (ss > 0) {
            return "dd";
        } else {
            return "ss";
        }
    }

    @RequestMapping("yonghutianjia")
    @ResponseBody
    public String yonghutianjia(user user, urlian urlian) {
        int ss = dengluService.tianjiayonghu(user);
        int dc = dengluService.selectgtjyg();
        urlian.setUserid(dc);
        urlian.setRoleid(user.getR_id());
        int dd = dengluService.tianjiayonghuzw(urlian);
        if (ss > 0 && dd > 0) {
            return "dd";
        } else {
            return "ss";
        }
    }

    @RequestMapping("baojieshizhangdan")
    public String baojieshizhangdan() {
        return "baojieshizhangdan";
    }

    @RequestMapping("zhangdanshengcheng")
    public String zhangdanshengcheng() {
        return "zhangdanshengcheng";
    }

    @RequestMapping("bjssyzd")
    @ResponseBody
    public Object bjssyzd(PageVo pagevo, baojieshi baojie, HttpSession session, String c_name) {
        String sss = "";
        if (c_name != null && c_name != "") {
            sss = "%" + c_name + "%";
        }
        List<baojieshi> bao = dengluService.bjsid(sss);
        List fff = new ArrayList();
        int d = 0;
        for (baojieshi baojieshi : bao) {
            List<baojszd> baozd = dengluService.bjsdzd(baojieshi.getC_id());
            if (baozd.size() == 0) {
                if (pagevo.getLimit() * (pagevo.getPage() - 1) <= d && pagevo.getLimit() * pagevo.getPage() > d) {
                    baojszd baojs = new baojszd();
                    baojs.setY_name(baojieshi.getC_name());
                    baojs.setY_age(baojieshi.getC_age());
                    baojs.setY_sex(baojieshi.getC_sex());
                    List<dingdan> sydl = dengluService.bjsdsydd(baojieshi.getC_id());
                    int dsl = 0;
                    int yfgz = 0;
                    for (dingdan dingdan : sydl) {
                        dsl++;
                        yfgz = yfgz + dingdan.getO_total();
                    }
                    baojs.setY_sydl(dsl);
                    List<pingjia> ding = dengluService.bjsdpjs(baojieshi.getC_id());
                    int hps = 0;
                    int cps = 0;
                    for (pingjia pingjia : ding) {
                        if (pingjia.getE_ping() >= 4) {
                            hps++;
                        } else {
                            cps++;
                        }
                    }
                    int sdfsdf = (int) (yfgz * 0.9);
                    baojs.setY_yfgz(yfgz);
                    baojs.setY_hps(hps);
                    baojs.setY_cps(cps);
                    int sfgz = sdfsdf - cps * 50;
                    baojs.setY_sfgz(sfgz);
                    baojs.setC_id(baojieshi.getC_id());
                    fff.add(baojs);
                }
                d++;
            }
        }
        PageUtil pageutil = new PageUtil();
        pageutil.setCount(d);
        pageutil.setCode(0);
        pageutil.setData(fff);
        pageutil.setMsg("");
        return pageutil;
    }

    @RequestMapping("tjbjszd")
    @ResponseBody
    public String tjbjszd(baojszd baojs) {
        baojs.setY_czsj(new Date());
        int ss = dengluService.tjbjszd(baojs);
        if (1 > 0) {
            return "dd";
        } else {
            return "ss";
        }
    }

    @RequestMapping("selectbjszdxx")
    @ResponseBody
    public Object selectbjszdxx(PageVo pagevo, baojszd bao, HttpSession session) {
        if (bao.getY_name() != null && bao.getY_name() != "") {
            String sss = "%" + bao.getY_name() + "%";
            bao.setY_name(sss);
        } else {
            bao.setY_name("");
        }
        int s = dengluService.bjsdzdSL(bao);
        List<baojszd> list = dengluService.bjsdzdxx(pagevo, bao);
        PageUtil pageutil = new PageUtil();
        pageutil.setCount(s);
        pageutil.setCode(0);
        pageutil.setData(list);
        pageutil.setMsg("");
        return pageutil;
    }

    @RequestMapping("gongsicaiwutongji")
    public String gongsicaiwutongji() {
        return "gongsicaiwutongji";
    }

    @RequestMapping("cwtjxx")
    @ResponseBody
    public Object cwtjxx() {
        List<baojszd> zs = dengluService.cwsytjxx();
        int ddzs = 0;
        int jyje = 0;
        int bjsgz = 0;
        int lr = 0;
        for (baojszd z : zs) {
            ddzs = ddzs + z.getY_sydl();
            jyje = jyje + z.getY_yfgz();
            bjsgz = bjsgz + z.getY_sfgz();
        }
        lr = jyje - bjsgz;
        List<baojszd> zss = dengluService.cwssytjxx();
        int ddszs = 0;
        int jysje = 0;
        int bjssgz = 0;
        int lsr = 0;
        for (baojszd zzs : zss) {
            ddszs = ddszs + zzs.getY_sydl();
            jysje = jysje + zzs.getY_yfgz();
            bjssgz = bjssgz + zzs.getY_sfgz();
        }
        lsr = jysje - bjssgz;
        List<dingdan> ds = dengluService.cwxytjxx();
        int ddxzs = 0;
        int jyxje = 0;
        int bjxsgz = 0;
        int lxr = 0;
        for (dingdan d : ds) {
            ddxzs = ddxzs + 1;
            jyxje = jyxje + d.getO_total();
            List<pingjia> ddsp = dengluService.pjs(d.getC_id());
            int h = 0;
            for (pingjia pingjia : ddsp) {
                if (pingjia.getE_ping() < 4) {
                    h++;
                }
            }
            bjxsgz = (int) (jyxje * 0.9) - 50 * h;
        }
        lxr = jyxje - bjxsgz;
        List dds = new ArrayList();
        dds.add(ddszs);
        dds.add(ddzs);
        dds.add(ddxzs);
        List jyj = new ArrayList();
        jyj.add(jysje);
        jyj.add(jyje);
        jyj.add(jyxje);
        List bgz = new ArrayList();
        bgz.add(bjssgz);
        bgz.add(bjsgz);
        bgz.add(bjxsgz);
        List glr = new ArrayList();
        glr.add(lsr);
        glr.add(lr);
        glr.add(lxr);
        List kkk = new ArrayList();
        kkk.add(dds);
        kkk.add(jyj);
        kkk.add(bgz);
        kkk.add(glr);
        return kkk;
    }

    @RequestMapping("gongsijinritongji")
    public String gongsijinritongji() {
        return "gongsijinritongji";
    }

    @RequestMapping("cwjrtjxx")
    @ResponseBody
    public Object cwjrtjxx() {
        List<dingdan> zs = dengluService.jrcwsydd();
        int shuoyou = 0;
        int wancheng = 0;
        int quxiao = 0;
        int jinxingzhong = 0;
        int jyje = 0;
        int bjshl = 0;
        int gshl = 0;
        for (dingdan z : zs) {
            if (z.getO_state().equals("已完成") && z.getO_paisong().equals("已完成")) {
                jyje = z.getO_total() + jyje;
                wancheng++;
                shuoyou++;
            } else if (z.getO_state().equals("已取消") && z.getO_paisong().equals("已取消")) {
                quxiao++;
                shuoyou++;
            } else {
                jinxingzhong++;
                shuoyou++;
            }
        }
        bjshl = (int) (jyje * 0.9);
        gshl = jyje - bjshl;
        List dds = new ArrayList();
        dds.add(shuoyou);
        dds.add(wancheng);
        dds.add(jinxingzhong);
        dds.add(quxiao);
        dds.add(jyje);
        dds.add(bjshl);
        dds.add(gshl);
        return dds;
    }

    @RequestMapping("quanxiantianjiashanchu")
    public String quanxiantianjiashanchu(Model model, HttpSession session) {
        int ss = (int) session.getAttribute("zw");
        List<user> us = dengluService.selectyfdhfdghgxx(ss);
        model.addAttribute("sqzw", us);
        return "quanxiantianjiashanchu";
    }

    @RequestMapping("csyqx")
    @ResponseBody
    public Object csyqx(HttpSession session) {
        int ss = (int) session.getAttribute("zw");
        List<quanxian> qx = dengluService.csyqx(ss);
        List<Fujie> fu = new ArrayList();
        for (quanxian quanxian : qx) {
            if (quanxian.getPid() == 0) {
                Fujie fujie = new Fujie();
                fujie.setTitle(quanxian.getName());
                fujie.setId(quanxian.getId());
                List<Zijie> zi = new ArrayList();
                for (quanxian quan : qx) {
                    if (quanxian.getId() == quan.getPid()) {
                        Zijie zij = new Zijie();
                        zij.setTitle(quan.getName());
                        zij.setId(quan.getId());
                        zi.add(zij);
                    }
                }
                fujie.setChildren(zi);
                fu.add(fujie);
            }
        }
        return fu;
    }

    @RequestMapping("czwqx")
    @ResponseBody
    public Object czwqx(Integer r_id) {
        List<quanxian> qx = dengluService.czwqx(r_id);
        List xx = new ArrayList();
        for (quanxian quanxian : qx) {
            xx.add(quanxian.getId());
        }
        return xx;
    }

    @RequestMapping("qxxg")
    @ResponseBody
    public Object qxxg(rmlian ur) {
        List<rmlian> dd = dengluService.cxqx(ur);
        if (dd.size() <= 0) {
            List<rmlian> ss = dengluService.cxzqx(ur);
            if (ss.size() <= 0) {
                int ddddss = dengluService.cxzpqx(ur.getMenuid());
                rmlian r = new rmlian();
                r.setRoleid(ur.getRoleid());
                r.setMenuid(ddddss);
                int dc = dengluService.tjzqx(r);
                int cd = dengluService.tjqx(ur);
            } else {
                int cd = dengluService.tjqx(ur);
            }
        } else {
            int sc = dengluService.scqx(ur);
            List<rmlian> ss = dengluService.cxzsqx(ur);
            if (ss.size() <= 0) {
                int ddf = dengluService.sczqx(ur);
            }
        }
        return "xx";
    }

    @RequestMapping("qxzxg")
    @ResponseBody
    public Object qxzxg(rmlian ur) {
        List<rmlian> dd = dengluService.cxqx(ur);
        if (dd.size() <= 0) {
            int ssd = dengluService.tjqx(ur);
            quanxian q = new quanxian();
            q.setPid(ur.getMenuid());
            List<quanxian> qx = dengluService.cxsyqx(q);
            for (quanxian quanxian : qx) {
                rmlian r = new rmlian();
                r.setRoleid(ur.getRoleid());
                r.setMenuid(quanxian.getId());
                int ddx = dengluService.tjqx(r);
            }
        } else {
            int ssd = dengluService.scqx(ur);
            quanxian q = new quanxian();
            q.setPid(ur.getMenuid());
            List<quanxian> qx = dengluService.cxsyqx(q);
            for (quanxian quanxian : qx) {
                rmlian r = new rmlian();
                r.setRoleid(ur.getRoleid());
                r.setMenuid(quanxian.getId());
                int ddx = dengluService.scqx(r);
            }
        }
        return "xx";
    }
}
