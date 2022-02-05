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
		

		System.out.println("Hello welcome to hangman!");
		System.out.println("Enter a word to be guessed: ");
		
		Scanner scan = new Scanner(System.in);
		String guessWord = scan.next();
		
		int chancesLeft = 7;
		
		while(chancesLeft >= 0)
		{
			
			Drawing game = new Drawing();
			game.podiumDrawing();
			chancesLeft = -1;
			
		}
		
		
		
	}
}
