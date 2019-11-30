/**
 * 
 */
package com.virtusa;

import static com.virtusa.constant.NumEnum.FIFTEEN;
import static com.virtusa.constant.NumEnum.HYPHEN_ONE;
import static com.virtusa.constant.NumEnum.ONE_9ZEROS;
import static com.virtusa.constant.NumEnum.ZERO;
import static com.virtusa.validation.NumValidator.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author arvind.varma
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class NumValidatorTest {
	
	@BeforeClass
	public static void setUp(){	
	}
	
	@Test
	public	void validNumTest() {
		assertTrue(isValid(FIFTEEN.getValue())); 
	}
	
	@Test
	public	void invalidNumTest1() {
		assertFalse(isValid(ZERO.getValue())); 
	}
	
	@Test
	public	void invalidNumTest2() {
		assertFalse(isValid(ONE_9ZEROS.getValue())); 
	}
	
	@Test
	public	void stringToIntInvalidTest() {
		assertEquals(stringToInt("A"),HYPHEN_ONE.getValue().intValue());
	}
	
	@Test
	public	void stringToIntValidTest() {
		assertEquals(stringToInt("15"),FIFTEEN.getValue().intValue());
	}
	
	@AfterClass
	public static void tearDown(){	
	}
}
