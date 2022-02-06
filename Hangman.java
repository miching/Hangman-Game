import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;



/**
 * @author Michael Ching
 *
 */
public class Hangman implements ActionListener
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		

		System.out.println("Hello welcome to hangman!");
		System.out.println("Enter a word to be guessed: ");
		
		Scanner scan = new Scanner(System.in);
		//String guessWord = scan.next();
		
		//Layout within frame
		JPanel panel = new JPanel();
		
		JFrame frame = new JFrame();
		frame.setSize(350,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.add(panel);
		
		panel.setLayout(null);
		
		JLabel guessLabel = new JLabel("Guessword");
		//(X,Y, width, height)
		guessLabel.setBounds(10,20,80,25);
		panel.add(guessLabel);
		
		JPasswordField guessWord = new JPasswordField();
		guessWord.setBounds(100,20,165,25);
		panel.add(guessWord);
		
		JButton button = new JButton("Submit");
		button.setBounds(10,80,80,25);
		panel.add(button);
		
		button.addActionListener(new Hangman());
		
		//char [] word = guessWord.getPassword();
		//String w = new String(word);
		String t = guessWord.getText();
		
		System.out.println("Word: " + t);
		
		
		frame.setVisible(true);
		
		
		
		int chancesLeft = 7;
		
		while(chancesLeft >= 0)
		{
			
			Drawing game = new Drawing();
			game.podiumDrawing();
			chancesLeft = -1;
			
		}
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		
		
	}
	
	
	
}
