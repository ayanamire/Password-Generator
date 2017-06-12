import java.util.concurrent.ThreadLocalRandom;

public class EasyPassword extends PWord
{
	String gen(int digit)
	{
    	StringBuffer stringy = new StringBuffer();  // Make string buffer
    	int intTime = 0;  // Random
    	String newStringy; // New Sting for return
    	
    	if (digit >= 6)  // Since this is easy mode, make sure the length is 6 or less
    		digit = 5;

    	// Fill in the password
    	for(int i=0; i<=digit-1; i++)
    	{
    		intTime = ThreadLocalRandom.current().nextInt((char)97, (char)123);
    		stringy.insert(i,Character.toString((char)intTime));
    	}
    	
    	newStringy = stringy.toString();  // Convert string buffer to string
    	return newStringy;  // Return string
	}
}
