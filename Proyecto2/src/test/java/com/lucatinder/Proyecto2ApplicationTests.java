package com.lucatinder;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.beans.factory.annotation.Autowired;
import com.lucatinder.controller.HomeController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Proyecto2ApplicationTests {

	@Autowired
	private HomeController controller;
	
	@Test
	public void contextLoads() throws Exception{
		
		
		assertThat(controller).isNotNull();
	}

}
