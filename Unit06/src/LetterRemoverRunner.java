//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		//add test cases
		LetterRemover h = new LetterRemover();
		h.setRemover("I am Sam I am   a",'a');
		out.println(h);
		h.setRemover("ssssssssxssssesssssesss   s",'s');
		out.println(h);
		h.setRemover("qwertyqwertyqwerty",'a');
		out.println(h);
		h.setRemover("abababababa   b",'b');
		out.println(h);
		h.setRemover("abaababababa   x",'x');
		out.println(h);
	}
}