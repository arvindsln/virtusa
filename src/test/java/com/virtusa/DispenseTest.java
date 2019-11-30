/**
 * 
 */
package com.virtusa;

import static com.virtusa.constant.NumEnum.ONE_6ZEROS;
import static com.virtusa.service.impl.NumDispenseChain.sConfig;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.virtusa.service.impl.DispenseMillion;
import com.virtusa.service.impl.DispenseThousand;
import com.virtusa.service.impl.NumDispenseChain;


/**
 * @author arvind.varma
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = {DispenseMillion.class, DispenseThousand.class})
public class DispenseTest {
	
	static NumDispenseChain numDispenseChain;
		
	@BeforeClass
	public static void setUp(){	
		numDispenseChain=sConfig();
	}
	
	@Test
	public void dispenseMillionTest()
	{		
		numDispenseChain.c1.dispense(ONE_6ZEROS.getValue().intValue());
	}
	
	@AfterClass
	public static void tearDown(){	
		numDispenseChain=null;	
	}
}
