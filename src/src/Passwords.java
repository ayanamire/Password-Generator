import java.util.Scanner;

public class Passwords
{
	// Main()
    public static void main(String[] args)
    {
    	PWord pgen;  // Class for the generator
    	
    	int buff = 2;  // Set default strength to "Normal"
    	Scanner sc = new Scanner(System.in);  // Open scanner
    	
    	System.out.print("Choose password strength\n1)Easy\n2)Medium\n3)Hard\n->");
    	int intake = sc.nextInt();
		System.out.print("Enter password length:  ");
		buff = sc.nextInt();  // Take in strength
		sc.close();  // Close the input scanner
    	
		// Determine which type of password to make: Easy, Medium, or Hard
		switch (intake)
		{
			case 1:
				pgen = new EasyPassword();
				break;
			case 2:
				pgen = new Regular();
				break;
			case 3:
				pgen = new HardPassword();
				break;
			default:
				throw new Error("Please make a new selection (1-3).");  // If they enter lower than 1 or higher than 3, throw err.
				
		}
		System.out.println(pgen.gen(buff));  // Print out the password
    }
}
