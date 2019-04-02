package com.gjl.systemprovicer.service;

import com.gjl.systemapi.user.model.UserDto;
import com.gjl.systemapi.user.service.UserService;
import com.gjl.systemprovicer.mapper.UserMapper;
import com.gjl.systemprovicer.model.UserModel;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author gjl
 * @create 2019-03-28 21:04
 **/
@Service
public class UserServiceImpl implements UserService{
    @Resource
    private UserMapper userMapper;

    @Override
    public boolean saveUser(UserDto usere) {
        UserModel userModel = new UserModel();
        BeanUtils.copyProperties(usere,userModel);
        int count = userMapper.insert(userModel);
        return count > 0;
    }

    @Override
    public UserDto getUser(Long id) {
        UserModel userModel = userMapper.selectByPrimaryKey(id);
        UserDto userDto = null;
        if(userModel != null){
            userDto = new UserDto();
            BeanUtils.copyProperties(userModel,userDto);
        }
        return userDto;
    }
}
