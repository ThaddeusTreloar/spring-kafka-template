package org.rnl.spring_template;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource(locations="classpath:test.properties")
class SpringTemplateApplicationTests {

	@Test
	void contextLoads() {
	}

}
