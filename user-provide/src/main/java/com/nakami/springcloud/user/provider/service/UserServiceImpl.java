package com.nakami.springcloud.user.provider.service;

import com.nakami.springcloud.user.api.model.BackUser;
import com.nakami.springcloud.user.api.service.UserService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.nakami.springcloud.user.provider.dao.UserDao;

import java.util.List;

/**
 * Created by wuxiao on 2019/12/4 19:09.
 */
@Service(version = "1.0.0")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public List<BackUser> getAllUser() {
        return userDao.selectAll();
    }
}
