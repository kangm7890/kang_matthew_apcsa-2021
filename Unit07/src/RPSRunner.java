//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		char response;
		String input = "y";
		//add in a do while loop after you get the basics up and running
		while (input == "y") {
			String player = "";
			out.print("type in your prompt [R,P,S] :: ");
			player = keyboard.next();
			RockPaperScissors game = new RockPaperScissors();
			game.setPlayers(player);
			out.println(game);
			out.println("Do you want to play again?");
			input = keyboard.next();
		}
			
			
	}
}



