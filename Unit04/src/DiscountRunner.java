//(c) A+ Computer Science
//www.apluscompsci.com

//Name - 
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class DiscountRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		Discount h = new Discount();
		out.print("Enter the original bill amount :: ");
		double amt = keyboard.nextDouble();
		System.out.printf("Bill after discount :: "+"%.2f",h.getDiscountedBill(amt));
		

	}
}