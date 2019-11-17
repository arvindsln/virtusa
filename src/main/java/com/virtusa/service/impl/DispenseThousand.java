package com.virtusa.service.impl;

import com.virtusa.service.DispenseChain;
import static com.virtusa.business.ThreeDigitToWordConverter.convertThreeDigitsNum;
import static com.virtusa.constant.NumEnum.*;
import org.springframework.stereotype.Service;

/**
 * @author arvind.varma
 *
 */
@Service
public class DispenseThousand implements DispenseChain {
	DispenseChain nextChain;
	@Override
	public void setNextChain(DispenseChain nextChain) {
		this.nextChain=nextChain;		
	}

	@Override
	public void dispense(int num) {
		if(num>=THOUSAND.getValue())
		{
			int thousandNum=num/THOUSAND.getValue();
			int remainderNum=num%THOUSAND.getValue();
			System.out.print(convertThreeDigitsNum(thousandNum)+"thousand ");
			if(remainderNum!=ZERO.getValue())
			{
				System.out.print(convertThreeDigitsNum(remainderNum));
			}
		}
		else 
		{
			System.out.print(convertThreeDigitsNum(num));
		}
		
	}
}