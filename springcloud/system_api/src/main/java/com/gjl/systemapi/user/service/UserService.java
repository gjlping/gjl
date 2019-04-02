package com.gjl.systemapi.user.service;

import com.gjl.systemapi.user.model.UserDto;

/**
 * @author gjl
 * @create 2019-03-28 15:19
 **/
public interface UserService {
    boolean saveUser(UserDto usere);
    UserDto getUser(Long id);
//    PageInfo<UserDto> getPage(UserDto userDto);
}
