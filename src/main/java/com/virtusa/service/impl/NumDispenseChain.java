/**
 * 
 */
package com.virtusa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.virtusa.service.DispenseChain;

/**
 * @author arvind.varma
 *
 */
@Component
@Configurable
public class NumDispenseChain {
	public DispenseChain c1;
	
	@Autowired
	public NumDispenseChain()
	{
		this.c1=new DispenseMillion();
		DispenseChain c2=new DispenseThousand();
		c1.setNextChain(c2);		
	}
	@Bean
	public static NumDispenseChain sConfig() {
	    return new NumDispenseChain();
	}
}
