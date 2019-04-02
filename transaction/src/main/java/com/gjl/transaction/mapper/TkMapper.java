package com.gjl.transaction.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author gjl
 * @create 2019-03-26 17:23
 **/
public interface TkMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
