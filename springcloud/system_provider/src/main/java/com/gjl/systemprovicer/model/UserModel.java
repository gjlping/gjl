package com.gjl.systemprovicer.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author gjl
 * @create 2019-03-28 15:17
 **/
@Data
@Table(name = "user_test")
public class UserModel implements Serializable{
    /**
     * 主键
     */
    @Id
    private Long id;
    /**
     * 用户名称
     */
    @Column(name = "user_name")
    private String userName;
    /**
     * 电话号
     */
    @Column(name = "phone")
    private String phone;
    /**
     * 邮箱
     */
    @Column(name = "email")
    private String email;
    /**
     * 密码
     */
    @Column(name = "pwd")
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
