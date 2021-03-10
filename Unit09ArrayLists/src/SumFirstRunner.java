import java.util.Arrays;
import java.util.List;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class SumFirstRunner
{
	public static void main( String args[] )
	{										
		ListSumFirst l = new ListSumFirst();
		List<Integer> case1 = Arrays.asList(-99,1,2,3,4,5,6,7,8,9,10,5);
		System.out.println(l.go(case1));
		List<Integer> case2 = Arrays.asList(10,9,8,7,6,5,4,3,2,1,-99);
		System.out.println(l.go(case2));
		List<Integer> case3 = Arrays.asList(10,20,30,40,50,-11818,40,30,20,10);
		System.out.println(l.go(case3));
	}
}