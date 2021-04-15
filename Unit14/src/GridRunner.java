//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class GridRunner
{
	public static void main( String args[] ) throws IOException
	{
		Grid Grid = new Grid(20, 20, new String[] {"a", "b", "c", "7", "9", "x", "2"});
		System.out.println(Grid);
		System.out.println("a count is " + Grid.countVals("a"));
		System.out.println("b count is " + Grid.countVals("b"));
		System.out.println("c count is " + Grid.countVals("c"));
		System.out.println("7 count is " + Grid.countVals("7"));
		System.out.println("9 count is " + Grid.countVals("9"));
		System.out.println("x count is " + Grid.countVals("x"));
		System.out.println("2 count is " + Grid.countVals("2"));
		System.out.println(Grid.findMax(new String[] {"a", "b", "c", "7", "9", "x", "2"}) + " occurs the most");
	}
}