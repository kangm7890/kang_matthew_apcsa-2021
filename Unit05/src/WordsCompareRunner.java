//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class WordsCompareRunner
{
   public static void main( String args[] )
   {
		//add test cases
	   WordsCompare h = new WordsCompare();
	   h.setWords("abe","ape");
	   out.println(h);
	   h.setWords("giraffe","gorilla");
	   out.println(h);
	   h.setWords("one","two");
	   out.println(h);
	   h.setWords("fun","funny");
	   out.println(h);
	   h.setWords("123","19");
	   out.println(h);
	   h.setWords("193","1910");
	   out.println(h);
	   h.setWords("goofy","godfather");
	   out.println(h);
	   h.setWords("funnel","fun");
	   out.println(h);
	}
}