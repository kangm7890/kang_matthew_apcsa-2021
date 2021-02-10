//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class FirstLastVowel
{
   public static String go( String a )
	{
	    a = a.toUpperCase();
		if (a.charAt(0) == 'A' || a.charAt(0) == 'E' || a.charAt(0) == 'I' || a.charAt(0) == 'O' || a.charAt(0) == 'U') {
			return "yes";
		} else if (a.charAt(a.length()-1) == 'A' || a.charAt(a.length()-1) == 'E' || a.charAt(a.length()-1) == 'I' || a.charAt(a.length()-1) == 'O' || a.charAt(a.length()-1) == 'U') {
			return "yes";
		} else {
			return "no";
		}
	}
}