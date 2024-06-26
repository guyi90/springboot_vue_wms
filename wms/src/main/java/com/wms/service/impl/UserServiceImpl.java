package com.wms.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wms.entity.User;
import com.wms.mapper.UserMapper;
import com.wms.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService  {
    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> listAll() {
        return userMapper.listAll();
    }

    @Override
    public IPage<User> pageC(Page<User> page) {
        return userMapper.pageC(page);
    }

    @Override
    public IPage<User> pageWW(Page<User> page, Wrapper wrapper) {
        return userMapper.pageW(page,wrapper);
    }


}
