package com.accp.web.controller;

import com.accp.pojo.User;
import com.accp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Description:
 * @Author: liyong
 * @CreateDate: 2018/1/16 17:41
 * @Version: 1.0
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public String list(Model model,Integer pageIndex,Integer pageSize) throws Exception {
        model.addAttribute("users",userService.getList(pageIndex,pageSize));
        return "list";
    }

    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public String  add(){
        return "add";
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public  String add(User user) throws Exception {
        userService.save(user);
        return "redirect:list";
    }
    @RequestMapping(value ="/update",method = RequestMethod.GET)
    public String update(Model model,Integer id) throws Exception {
        model.addAttribute("user",userService.findById(id));
        return "update";
    }

    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public String update(User user) throws Exception {
        userService.edit(user);
        return "redirect:list";
    }

    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    public String delete(Integer id) throws Exception {
        userService.delete(id);
        return "redirect:list";
    }
}
