package com.gjl.systemprovicer.mapper;

import com.gjl.systemprovicer.model.UserModel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author gjl
 * @create 2019-03-28 21:14
 **/
@Mapper
public interface UserMapper extends TkMapper<UserModel>{

}
