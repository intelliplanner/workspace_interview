package com.javatechie.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringWithMySqlAndJpaCrudApplicationTests {
	Logger log = LoggerFactory.getLogger(SpringWithMySqlAndJpaCrudApplication.class);

	@Test
	void contextLoads() {
		log.info("Application loaded....");
		assertEquals(true, true);
	}

}
