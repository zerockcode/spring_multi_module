package org.zerok.service;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.service.SampleService;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/service-context.xml")
@Log4j
public class SampleServiceTests {

	@Setter(onMethod_= @Autowired)
	private SampleService service;
	
	@Test
	public void test1() {
		
		log.info("test1");
		assertNotNull(service);
		log.info(service);
		
	}
	
}
