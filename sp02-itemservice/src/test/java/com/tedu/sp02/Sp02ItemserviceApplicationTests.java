package com.tedu.sp02;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Sp02ItemserviceApplicationTests {

	@Test
	public void contextLoads() {
		
		String b =new String("hello");
		String a="hello";
		System.out.println(a==b);
	}

}
