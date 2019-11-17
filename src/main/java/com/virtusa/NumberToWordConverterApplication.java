package com.virtusa;

import static com.virtusa.constant.NumEnum.HYPHEN_ONE;
import static com.virtusa.constant.NumEnum.ZERO;
import static com.virtusa.validation.NumValidator.isValid;
import static com.virtusa.validation.NumValidator.stringToInt;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.virtusa.service.impl.NumDispenseChain;

@EnableAutoConfiguration
@SpringBootApplication
@Configuration
@ComponentScan("{com.virtusa}")
public class NumberToWordConverterApplication {

	 @Autowired
	private static NumDispenseChain numDispenseChain;
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		SpringApplication.run(NumberToWordConverterApplication.class, args);
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number between 1 to 999999999");
		int num ;
		 String letter = null ;
		 int count=ZERO.getValue();
		 do
		 {
			 if(count>ZERO.getValue())
			System.out.println("Incorrect input: "+letter+", enter any number again between 1 to 999999999");
			 letter= sc.next();
			 num = stringToInt(letter);	
			 if(!isValid(num))
				 num=HYPHEN_ONE.getValue();
			 ++count;
		 }while (num==HYPHEN_ONE.getValue()) ;
			 	
		 numDispenseChain.sConfig().c1.dispense(num);
		
	}
	
}
