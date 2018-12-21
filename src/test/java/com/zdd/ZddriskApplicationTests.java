package com.zdd;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@MapperScan("com.zdd.risk.dao")
@SpringBootTest
public class ZddriskApplicationTests {

	@Test
	public void contextLoads() {
	}

	public static void main(String[] args) {
		SpringApplication.run(ZddriskApplication.class, args);
	}
}
