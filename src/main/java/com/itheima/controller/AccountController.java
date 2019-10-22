package com.itheima.controller;

import com.itheima.domain.Account;
import com.itheima.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/list")
    public ModelAndView accountList(ModelAndView modelAndView){

        List<Account> accountList =accountService.findAll();
        modelAndView.addObject("accountList",accountList);

        modelAndView.setViewName("accountList");

        return modelAndView;
    }

    @RequestMapping("/addUI")
    public String addUI(Account account){
        return "addUI";
    }


    @RequestMapping("/add")
    public String add(Account account){

        accountService.add(account);

        return "redirect:/account/list.do";
    }

    @RequestMapping("/del")
    public String del(int id){

        accountService.deleteById(id);

        return "forward:/account/list.do";

    }


}
