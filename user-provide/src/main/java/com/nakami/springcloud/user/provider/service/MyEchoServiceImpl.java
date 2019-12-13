package com.nakami.springcloud.user.provider.service;

import com.nakami.springcloud.user.api.service.MyEchoService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.nakami.springcloud.user.provider.dao.UserDao;

/**
 * Created by wuxiao on 2019/11/28 15:58.
 */
@Service(version = "1.0.0")
public class MyEchoServiceImpl implements MyEchoService {
    @Autowired
    UserDao userDao;
    @Override
    public String echo() {
        return "greeting8092";
    }
}
