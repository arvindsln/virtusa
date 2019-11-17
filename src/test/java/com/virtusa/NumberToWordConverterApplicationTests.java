package com.virtusa;

import static com.virtusa.business.ThreeDigitToWordConverter.convertThreeDigitsNum;
import static com.virtusa.constant.NumEnum.FIFTEEN;
import static com.virtusa.constant.NumEnum.HYPHEN_ONE;
import static com.virtusa.constant.NumEnum.NINE_HUNDRED_NINE;
import static com.virtusa.constant.NumEnum.NINE_THOUSAND_NINE_HUNDRED_NINE;
import static com.virtusa.constant.NumEnum.ONE_9ZEROS;
import static com.virtusa.constant.NumEnum.THOUSAND;
import static com.virtusa.validation.NumValidator.isValid;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NumberToWordConverterApplicationTests {

	@Before
	public void setUp(){	
	}
	
	@Test
	public	void convertThreeDigitsNumTest1() {
		assertEquals(convertThreeDigitsNum(FIFTEEN.getValue()).trim(), "Fifteen"); 
	}
	
	@Test
	public	void convertThreeDigitsNumTest2() {
		assertEquals(convertThreeDigitsNum(NINE_HUNDRED_NINE.getValue()).trim(), "Nine Hundred Ninety Nine"); 
	}
	
	@Test
	public	void convertThreeDigitsNumOutOfRangeTest1() {
		assertEquals(convertThreeDigitsNum(HYPHEN_ONE.getValue()).trim(), ""); 
	}
	
	@Test
	public	void convertThreeDigitsNumOutOfRangeTest2() {
		assertEquals(convertThreeDigitsNum(THOUSAND.getValue()).trim(), ""); 
	}
	
	@Test
	public	void minBoundaryTest() {
		assertFalse(isValid(HYPHEN_ONE.getValue())); 
	}
	
	@Test
	public	void maxBoundaryTest() {
		assertFalse(isValid(ONE_9ZEROS.getValue())); 
	}
	
	@Test
	public	void numWithinRangeTest() {
		assertTrue(isValid(NINE_THOUSAND_NINE_HUNDRED_NINE.getValue())); 
	}
		
	@After
	public void tearDown(){	
	}

}
