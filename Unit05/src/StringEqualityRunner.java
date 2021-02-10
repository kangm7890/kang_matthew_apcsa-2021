//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		//add test cases
		StringEquality h = new StringEquality();
		h.setWords("hello","goodbye");
		out.println(h);
		h.setWords("one","two");
		out.println(h);
		h.setWords("three","four");
		out.println(h);
		h.setWords("TCEA","UIL");
		out.println(h);
		h.setWords("State","Champions");
		out.println(h);
		h.setWords("ABC","ABC");
		out.println(h);
		h.setWords("ABC","CBA");
		out.println(h);
		h.setWords("Same","Same");
		out.println(h);
	}
}