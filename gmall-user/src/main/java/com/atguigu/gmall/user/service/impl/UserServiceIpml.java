package com.atguigu.gmall.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.gmall.bean.UserInfo;
import com.atguigu.gmall.service.UserService;
import com.atguigu.gmall.user.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author guomanliang
 * @create 2021-10-27-18:58
 */
@Service
public class UserServiceIpml implements UserService {

    @Autowired
    UserInfoMapper userInfoMapper;
    @Autowired


    @Override
    public List<UserInfo> userInfoList() {
        return userInfoMapper.selectAll();
    }
}
