package com.atguigu.gmall.user.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall.bean.UserInfo;
import com.atguigu.gmall.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author guomanliang
 * @create 2021-10-27-18:38
 */
@RestController
public class UserController {

    @Reference
    UserService userService;

    @RequestMapping("/userInfoList")
    public List<UserInfo> userInfoList(){

        List<UserInfo> userInfoList = userService.userInfoList();
        return userInfoList;
    }
}
