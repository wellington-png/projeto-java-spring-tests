package com.educandoweb.course;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CourseApplicationTests {

	@Test
	void contextLoads() {
		Double x = 4.0;
		Double y = Math.sqrt(x);

		System.out.println(y);

		Assertions.assertEquals(2.0, y);
	}

}
