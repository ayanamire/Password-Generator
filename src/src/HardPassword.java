import java.util.concurrent.ThreadLocalRandom;

public class HardPassword extends PWord
{
	String gen(int digit)
	{
    	StringBuffer stringy = new StringBuffer();  // Make string buffer
    	int randy = 0; // Random
    	int intTime = 0;  // Random
    	String newStringy; // New Sting for return
    	
    	// Make sure the length is big so it's harder to guess.
    	if (digit < 16)
    		digit = 17;

    	// Fill in the password
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
    	
    	newStringy = stringy.toString();  // Convert string buffer to string
    	return newStringy;  // Return string
	}
}
