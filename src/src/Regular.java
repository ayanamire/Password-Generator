import java.util.concurrent.ThreadLocalRandom;

public class Regular extends PWord
{
	String gen(int digit)
	{
    	StringBuffer stringy = new StringBuffer();  // Make string buffer
    	int randy = 0; // Random
    	int intTime = 0; // Random
    	String newStringy; // New Sting for return

    	// Make sure the length is big so it's harder to guess.
    	for(int i=0; i<=digit-1; i++)
    	{
    		randy = ThreadLocalRandom.current().nextInt(0,2);
    		if (randy == 0)
    			intTime = ThreadLocalRandom.current().nextInt((char)65, (char)91);
    		else if (randy == 1)
    			intTime = ThreadLocalRandom.current().nextInt((char)97, (char)123);
    		
    		stringy.insert(i,Character.toString((char)intTime));
    	}
    	
    	newStringy = stringy.toString();  // Convert string buffer to string
		return newStringy;  // Return string
	}
}
