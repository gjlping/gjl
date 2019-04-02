package com.gjl.systemapi.user.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @author gjl
 * @create 2019-03-28 15:17
 **/
@Data
public class UserDto implements Serializable{
    /**
     * 主键
     */
    private Long id;
    /**
     * 部门名称
     */
    private String userName;
    /**
     * 电话号
     */
    private String phone;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 密码
     */
    private String pwd;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
