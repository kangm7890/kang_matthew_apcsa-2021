//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWord
{
	//instance variables and constructors could be present, but are not necessary
		
	public static void printTriangle(String word)
	{
		String output = "";
		for (int i = 0; i < word.length(); i++)
		{
			output = output + word.charAt(i);
			for (int j = 0; j <= i; j++)
			{
				System.out.print(output);
			}
			System.out.println();
		}
	}
}