import java.util.Scanner;

public class diceClass1 {

	public static void displayMessage()
	{
		Scanner Input = new Scanner(System.in);
		
		String answer;
		
		System.out.print("Would you like to play the dice game? ");
		answer = Input.next();
		
		if ( answer.equalsIgnoreCase("no"))
			{
			System.out.println( "Goodbye!");
			}
		if ( answer.equalsIgnoreCase("yes"))
			{
			diceClass2 initialQuestion2 = new diceClass2(); //constructor part 2
			initialQuestion2.displayMessage();
			}
	}
}

