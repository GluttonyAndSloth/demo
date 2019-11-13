package com.home.demo.controller;


import com.home.demo.service.ShouYeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;


@Controller
public class ShouYeController {
    @Resource
    ShouYeService sys;

    @RequestMapping("/selectzhuye")
    public String select(Model model) {
        int y = sys.select();
        model.addAttribute("y", y);
        int b = sys.select1();
        model.addAttribute("b", b);
        int d = sys.select2();
        model.addAttribute("d", d);
        int f = sys.select3();
        model.addAttribute("f", f);
        return "zhuye";
    }
}
