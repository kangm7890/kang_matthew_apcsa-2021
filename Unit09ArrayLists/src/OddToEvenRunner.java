import java.util.Arrays;
import java.util.List;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class OddToEvenRunner
{
	public static void main( String args[] )
	{
		ListOddToEven l = new ListOddToEven();
		List<Integer> case1 = Arrays.asList(7,1,5,3,11,5,6,7,8,9,10,12345,11);
		System.out.println(l.go(case1));
		List<Integer> case2 = Arrays.asList(11,9,8,7,6,5,4,3,2,1,-99,7);
		System.out.println(l.go(case2));
		List<Integer> case3 = Arrays.asList(10,20,30,40,5,41,31,20,11,7);
		System.out.println(l.go(case3));
		List<Integer> case4 = Arrays.asList(2,7,11,21,5,7);
		System.out.println(l.go(case4));
		List<Integer> case5 = Arrays.asList(2,4,6,8,8);
		System.out.println(l.go(case5));
	}
}