import java.util.*;
import java.io.Console;


/**
 * @author Michael Ching
 *
 */
public class Hangman
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		
/*
		System.out.println("Hello welcome to hangman!");
		System.out.println("Enter a word to be guessed: ");
		Scanner scan = new Scanner(System.in);
		
		//String guessWord = scan.next();
		
		Console cnsl = System.console();
		char[] ch = cnsl.readPassword(
	            "Enter password : ");
		String temp = new String (ch);
		
		System.out.println(temp);
*/
Scanner scan = new Scanner(System.in);
		
		String guessWord = scan.next();
		
		// Create the console object
        Console cnsl
            = System.console();
  
        if (cnsl == null) {
            System.out.println(
                "No console available");
            return;
        }
  
        // Read line
        String str = cnsl.readLine(
            "Enter username : ");
  
        // Print username
        System.out.println(
            "Username : " + str);
  
        // Read password
        // into character array
        char[] ch = cnsl.readPassword(
            "Enter password : ");
  
        // Print password
        System.out.println(
            "Password : " + ch);
	}

}
