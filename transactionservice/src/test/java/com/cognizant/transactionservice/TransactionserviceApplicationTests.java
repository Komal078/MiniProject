package com.cognizant.transactionservice;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cognizant.transactionservice.controller.TransactionRestController;

@SpringBootTest
class TransactionserviceApplicationTests {
	
	@Autowired
	TransactionRestController rl;
	
	@Test
	void contextLoads() {
		assertNotNull(rl);
	}

}
