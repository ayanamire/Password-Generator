/*
 * Class for the easy passwords.
 * 
 * Maximum length is 7 characters, password in all lowercase.
 * 
 * Author:  Alex C. Gardner
 * Date:  June 6, 2017
 * Version 1.0 FINAL
 */

import java.util.concurrent.ThreadLocalRandom;

public class EasyPassword
{
	// Make the string
	public static String generate(int digit)
	{
    	StringBuffer stringy = new StringBuffer();
    	int intTime = 0;
    	String newStringy;
    	
    	if (digit >= 6)
    		digit = 5;

    	for(int i=0; i<=digit-1; i++)
    	{
    		intTime = ThreadLocalRandom.current().nextInt((char)97, (char)123);
    		stringy.insert(i,Character.toString((char)intTime));
    	}
    	
    	newStringy = stringy.toString();
    	return newStringy;
	}
}
