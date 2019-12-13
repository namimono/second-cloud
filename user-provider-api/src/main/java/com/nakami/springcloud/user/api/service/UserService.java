package com.nakami.springcloud.user.api.service;



import com.nakami.springcloud.user.api.model.BackUser;

import java.util.List;

/**
 * Created by wuxiao on 2019/11/28 15:15.
 */

public interface UserService {
    List<BackUser> getAllUser();
}
