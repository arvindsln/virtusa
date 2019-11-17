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
public class DispenseMillion implements DispenseChain {
	DispenseChain nextChain;
	@Override
	public void setNextChain(DispenseChain nextChain) {
		this.nextChain=nextChain;		
	}

	@Override
	public void dispense(int num) {
		if(num>=ONE_6ZEROS.getValue())
		{
			int millionNum=num/ONE_6ZEROS.getValue();
			int remainderNum=num%ONE_6ZEROS.getValue();
			System.out.print(convertThreeDigitsNum(millionNum)+"million ");
			if(remainderNum!=ZERO.getValue())
			{
				nextChain.dispense(remainderNum);
			}
		}
		else
		{
			nextChain.dispense(num);
		}
	}
}