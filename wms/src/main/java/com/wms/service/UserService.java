package com.wms.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wms.entity.User;

import java.util.List;

public interface UserService extends IService<User> {
    List<User> listAll();

    IPage<User> pageC(Page<User> page);

    IPage<User> pageWW(Page<User> page, Wrapper wrapper);
}
