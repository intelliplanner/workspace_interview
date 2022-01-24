package com.javatechie.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringWithMySqlAndJpaCrudApplicationTests {

	@Test
	void contextLoads() {
		assertEquals(true, true);
	}

}
