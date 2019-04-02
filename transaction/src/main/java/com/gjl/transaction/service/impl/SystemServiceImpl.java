package com.gjl.transaction.service.impl;

import com.gjl.transaction.mapper.SystemMapper;
import com.gjl.transaction.service.SystemService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author gjl
 * @create 2019-03-26 17:26
 **/
@Service
public class SystemServiceImpl implements SystemService{
    @Resource
    private SystemMapper systemMapper;

    @Override
    @Transactional
    public void testTransaction() {
        System.out.println("开始事物处理");
        com.gjl.transaction.mapper.System system = new com.gjl.transaction.mapper.System();
        system.setCode("code");
        system.setName("name");
        system.setId(111112L);
        systemMapper.insert(system);

        system.setName("name1");
        systemMapper.updateByPrimaryKey(system);
    }
}
