package com.lucatinder;


import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.lucatinder.model.User;
import com.lucatinder.services.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestPablo {
	
	private static final Logger logger = LoggerFactory.getLogger(TestPablo.class);
	
	
	
	@Autowired
	private UserService userServ;
	
	@Test
	public void DeleteByIdTest() {
		
		int cantidadInicial = 0;
		int cantidadFinal = 0;
	
			List<User> usuariosInicial = userServ.list();
			List<User> usuariosFinal;
			cantidadInicial = usuariosInicial.size();
			userServ.deleteById(2);
			usuariosFinal = userServ.list();
			cantidadFinal = usuariosFinal.size();	
			assertEquals(cantidadFinal, cantidadInicial-1);	
	}

}
