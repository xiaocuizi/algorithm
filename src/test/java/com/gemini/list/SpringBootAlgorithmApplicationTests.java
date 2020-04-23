package com.gemini.list;

import com.gemini.aop.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

import javax.annotation.Resource;
@RunWith(SpringRunner.class)
@SpringBootTest
public  class SpringBootAlgorithmApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Resource
	private UserService userService;

	@Test
	public void testAop1() {
		// userService.save("张三");
		// Assert.isTrue(true);
	}

	@Test
	public void testAop2() {
		// userService.save("a");
	}

	@Test
	public void testAop3() {
		userService.testAnnotationAop();
	}

}
