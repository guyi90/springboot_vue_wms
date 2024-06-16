package com.wms.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wms.common.QueryPageParam;
import com.wms.entity.User;
import com.wms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/user")
public class HelloController {
    @GetMapping
    public String hello(){
        return "hello wms";
    }

    @Autowired
    private UserService userService;

    //查询
    @GetMapping("/list")
    public List<User> list(){
        return userService.listAll();
    }

    //保存
    @PostMapping("/save")
    public boolean save(@RequestBody User user){
        return userService.save(user);
    }

    //修改
    @PostMapping("/mod")
    public boolean mod(@RequestBody User user){
        return userService.updateById(user);
    }

    //保存或修改
    @PostMapping("/saveOrMod")
    public boolean saveOrMod(@RequestBody User user){
        return userService.saveOrUpdate(user);
    }

    //删除
    @GetMapping("/delete")
    public boolean delete(@RequestBody User user){
        return userService.removeById(user.getId());
    }

    //查询（模糊匹配）
    @PostMapping("/listP")
    public List<User> listP(@RequestBody User user){
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.like(User::getName, user.getName());
        return userService.list(queryWrapper);
    }

    @PostMapping("/listPage")
    public List<User> listPage(@RequestBody QueryPageParam queryPageParam){

        Page<User> page = new Page<>(queryPageParam.getPageNum(),queryPageParam.getPageSize());
        String name =(String) queryPageParam.getParam().get("name");


        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.like(User::getName,name);

        IPage<User> result = userService.page(page, queryWrapper);


        return result.getRecords();
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

}
