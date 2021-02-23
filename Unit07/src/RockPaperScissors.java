//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import java.util.Random;
import static java.lang.System.*;
public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;
	Random rand = new Random();
	
	public RockPaperScissors()
	{
		playChoice = "";
		compChoice = "";
	}

	public RockPaperScissors(String player)
	{
		setPlayers(player);
	}

	public void setPlayers(String player)
	{
		playChoice = player;
		int comp = rand.nextInt(3);
		switch (comp) {
		case 0:
			compChoice = "R";
			break;
		case 1:
			compChoice = "P";
			break;
		case 2:
			compChoice = "S";
			break;
		}
	}

	public String determineWinner()
	{
		String winner = "";
		switch (compChoice) {
		case "R":
			switch(playChoice) {
			case "R":
				winner = "draw";
				break;
			case "P":
				winner = "player";
				break;
			case "S":
				winner = "computer";
				break;
			}
		break;
		case "P":
			switch(playChoice) {
			case "R":
				winner = "computer";
				break;
			case "P":
				winner = "draw";
				break;
			case "S":
				winner = "player";
				break;
			}
		break;
		case "S":
			switch(playChoice) {
			case "R":
				winner = "player";
				break;
			case "P":
				winner = "computer";
				break;
			case "S":
				winner = "draw";
				break;
			}
		break;
		}
		return winner;
		
	}

	public String toString()
	{
		String outcome = "";
		String rationale = "";
		switch (determineWinner()) {
		case "player":
			outcome = "!Player wins ";
			switch (playChoice) {
			case "R":
				rationale = "<<Rock Breaks Scissors>>!";
				break;
			case "P":
				rationale = "<<Paper Covers Rock>>!";
				break;
			case "S":
				rationale = "<<Scissors Cut Paper>>!";
				break;
			}
			break;
		case "draw":
			outcome = "!Draw Game!";
			break;
		case "computer":
			outcome = "!Computer wins ";
			switch (compChoice) {
			case "R":
				rationale = "<<Rock Breaks Scissors>>!";
				break;
			case "P":
				rationale = "<<Paper Covers Rock>>!";
				break;
			case "S":
				rationale = "<<Scissors Cut Paper>>!";
				break;
			}
			break;
		}
		return "player had " + playChoice + "\ncomputer had " + compChoice+ "\n" + outcome + rationale;
	}
}