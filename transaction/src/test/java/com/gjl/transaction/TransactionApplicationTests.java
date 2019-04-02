package com.gjl.transaction;

import com.gjl.transaction.service.SystemService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TransactionApplicationTests {

	@Resource
	SystemService systemService;

	@Test
	public void contextLoads() {
		systemService.testTransaction();
	}

}
