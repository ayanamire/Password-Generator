/*
 * Class for the regular passwords.
 * 
 * All lower and uppercase, no @, no max or min length.
 * Author:  Alex C. Gardner
 * Date:  June 6, 2017
 * Version 1.0 FINAL
 */


import java.util.concurrent.ThreadLocalRandom;

public class Regular
{
	// Make the string
	public static String generate(int digit)
	{
    	StringBuffer stringy = new StringBuffer();
    	int randy = 0;
    	int intTime = 0;
    	String newStringy;

    	for(int i=0; i<=digit-1; i++)
    	{
    		randy = ThreadLocalRandom.current().nextInt(0,2);
    		if (randy == 0)
    			intTime = ThreadLocalRandom.current().nextInt((char)65, (char)91);
    		else if (randy == 1)
    			intTime = ThreadLocalRandom.current().nextInt((char)97, (char)123);
    		
    		stringy.insert(i,Character.toString((char)intTime));
    	}
    	
    	newStringy = stringy.toString();
    	return newStringy;
	}
}
