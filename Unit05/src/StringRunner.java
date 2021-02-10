//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringRunner
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(in);
		StringOddOrEven h = new StringOddOrEven();
		out.println("Enter a word :: ");
		String s = keyboard.next();
		h.setString(s);
		out.println(h);
	}
}