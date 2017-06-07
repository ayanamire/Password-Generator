/*
 * Class for the hard passwords.
 * 
 * Minimum length is 17 characters, @ symbol allowed.
 * Author:  Alex C. Gardner
 * Date:  June 6, 2017
 * Version 1.0 FINAL
 */

import java.util.concurrent.ThreadLocalRandom;

public class HardPassword
{
	// Make the string
	public static String generate(int digit)
	{
    	StringBuffer stringy = new StringBuffer();
    	int randy = 0;
    	int intTime = 0;
    	String newStringy;
    	
    	// Make sure the length is big so it's harder to guess.
    	if (digit < 16)
    		digit = 32;

    	for(int i=0; i<=digit-1; i++)
    	{
    		randy = ThreadLocalRandom.current().nextInt(0,3);
    		
    		if (randy == 0)
    			intTime = ThreadLocalRandom.current().nextInt((char)48, (char)58);
    		else if (randy == 1)
    			intTime = ThreadLocalRandom.current().nextInt((char)64, (char)91);
    		else if (randy == 2)
    			intTime = ThreadLocalRandom.current().nextInt((char)97, (char)123);
    		
    		stringy.insert(i,Character.toString((char)intTime));
    	}
    	
    	newStringy = stringy.toString();
    	return newStringy;
	}
	
	
	// Flip the string!
	public static String flips(String s)
	{
		return new StringBuilder(s).reverse().toString();
	}
}
