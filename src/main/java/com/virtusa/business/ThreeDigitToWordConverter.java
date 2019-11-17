/**
 * 
 */
package com.virtusa.business;

import org.springframework.stereotype.Component;
import static com.virtusa.constant.NumEnum.*;

/**
 * @author arvind.varma
 *
 */
@Component
public class ThreeDigitToWordConverter {
	  private static String [] LESSTHANTWENTY = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
	  private static String [] LESSTHANHUNDRED = {"Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
	public static String convertThreeDigitsNum(int num){
        if(num <= ZERO.getValue() || num>NINE_HUNDRED_NINE.getValue()) 
            return "";
        else if(num < TWENTY.getValue())
            return LESSTHANTWENTY[num - ONE.getValue()] + " ";
        else if(num >= TWENTY.getValue() && num < HUNDRED.getValue())
            return LESSTHANHUNDRED[num/TEN.getValue() - TWO.getValue()] + " " + convertThreeDigitsNum(num%TEN.getValue());
        else
            return LESSTHANTWENTY[num/HUNDRED.getValue() - ONE.getValue()] + " Hundred " + convertThreeDigitsNum(num%HUNDRED.getValue());
    }
}
