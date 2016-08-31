package com.upsmart.dubbo.provider;

import com.upsmart.api.User;
import com.upsmart.api.UserService;

public class UserServiceImpl implements UserService {

    public User getUser(Long id) {
        return new User(id, "username" + id);
    }
    

}
