/*
 * My first actual useful Java application.
 * 
 * Random string/password generator.  Enter how long you want your string/pw to be and it makes it!
 * Guaranteed secure password; this program will not record your results--inspect the code
 * and see for yourself!
 * 
 * Author:  Alex C. Gardner
 * Date:  June 6, 2017
 * Version 1.0 FINAL
 */

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Passwords
{
	// Classes of password strengths
	static EasyPassword foo = new EasyPassword();
	static HardPassword bar = new HardPassword();
	static Regular nes = new Regular();
	
	// Main()
    public static void main(String[] args)
    {
    	int buff = 2;  // Set default strength to "Normal"
    	Scanner sc = new Scanner(System.in);  // Open scanner
    	
    	System.out.print("Choose password strength\n1)Easy\n2)Medium\n3)Hard\n->");
    	int intake = sc.nextInt();
		System.out.print("Enter password length:  ");
		buff = sc.nextInt();  // Take in strength
    	
		// Display password strengths
    	if (intake == 1)
    		System.out.println(EasyPassword.generate(buff));
    	else if (intake == 2)
    		System.out.println(Regular.generate(buff));
    	else if (intake == 3)
    		System.out.println(HardPassword.flips(HardPassword.generate(buff)));
    }
}
