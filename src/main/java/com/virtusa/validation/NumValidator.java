package com.virtusa.validation;
import org.springframework.stereotype.Service;
import static com.virtusa.constant.NumEnum.*;

/**
 * @author arvind.varma
 *
 */
@Service
public class NumValidator {
	public static boolean isValid(int num)
	{
		boolean isValid=true;
		if(num<=ZERO.getValue() || num>NINE_NINES.getValue())
		{
			isValid= false;
		}
		return isValid;
	}
	
	public static int stringToInt(String param) {
        for(char c : param.toCharArray()) {
                if(!Character.isDigit(c))
                        return HYPHEN_ONE.getValue();
        }
        int num=HYPHEN_ONE.getValue();
        try{
        	num=Integer.parseInt(param);
        }
        catch(NumberFormatException nfe)
        {
        	return num;
        }
        return num;
}

}
