package com.nakami.springcloud.user.provider.dao;

import com.nakami.springcloud.user.api.model.BackUser;
import tk.mybatis.mapper.common.Mapper;

/**
 * Created by wuxiao on 2019/11/30 10:11.
 */
@org.apache.ibatis.annotations.Mapper
public interface UserDao extends Mapper<BackUser> {
    BackUser getUserByName();
}
