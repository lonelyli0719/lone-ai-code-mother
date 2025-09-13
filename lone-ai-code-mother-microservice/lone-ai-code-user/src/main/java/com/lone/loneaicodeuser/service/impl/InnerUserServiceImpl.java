package com.lone.loneaicodeuser.service.impl;

import com.lone.loneaicodemother.model.entity.User;
import com.lone.loneaicodemother.model.vo.UserVO;
import com.lone.loneaicodeuser.service.UserService;
import jakarta.annotation.Resource;
import org.apache.dubbo.config.annotation.DubboService;
import com.lone.loneaicodemother.innerservice.InnerUserService;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

@DubboService
public class InnerUserServiceImpl implements InnerUserService {

    @Resource
    private UserService userService;

    @Override
    public List<User> listByIds(Collection<? extends Serializable> ids) {
        return userService.listByIds(ids);
    }

    @Override
    public User getById(Serializable id) {
        return userService.getById(id);
    }

    @Override
    public UserVO getUserVO(User user) {
        return userService.getUserVO(user);
    }
}
