package com.wms.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wms.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface    UserMapper extends BaseMapper<User> {

    @Select("SELECT * FROM user ${ew.customSqlSegment}")
    IPage<User> pageW(Page<User> page, @Param(Constants.WRAPPER) Wrapper<User> wrapperryWrapper) ;

    List<User> listAll();

    IPage<User> pageC(Page<User> page);


}
