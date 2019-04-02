package com.gjl.systemprovicer.controller;

import com.gjl.systemapi.user.model.UserDto;
import com.gjl.systemapi.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * @author gjl
 * @create 2019-03-28 21:05
 **/
@RestController
@RequestMapping("user")
@ResponseBody
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping(value = "get",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public UserDto getUser(@RequestParam Long id){
        return userService.getUser(id);
    }

}
