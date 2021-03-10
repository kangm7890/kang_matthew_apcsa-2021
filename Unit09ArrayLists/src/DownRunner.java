//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class DownRunner
{
	public static void main( String args[] )
	{
		ListDown l = new ListDown();
		List<Integer> case1 = Arrays.asList(-99,1,2,3,4,5,6,7,8,9,10,12345);
		System.out.println(l.go(case1));
		List<Integer> case2 = Arrays.asList(10,9,8,7,6,5,4,3,2,1,-99);
		System.out.println(l.go(case2));
		List<Integer> case3 = Arrays.asList(10,20,30,40,50,-11818,40,30,20,10);
		System.out.println(l.go(case3));
		List<Integer> case4 = Arrays.asList(32767);
		System.out.println(l.go(case4));
		List<Integer> case5 = Arrays.asList(255,255);
		System.out.println(l.go(case5));
		List<Integer> case6 = Arrays.asList(9,10,-88,100,-555,1000);
		System.out.println(l.go(case6));
		List<Integer> case7 = Arrays.asList(10,10,10,11,456);
		System.out.println(l.go(case7));
		List<Integer> case8 = Arrays.asList(-111,1,2,3,9,11,20,30);
		System.out.println(l.go(case8));
		List<Integer> case9 = Arrays.asList(9,8,7,6,5,4,3,2,0,-2,-989);
		System.out.println(l.go(case9));
		List<Integer> case10 = Arrays.asList(12,15,18,21,23,1000);
		System.out.println(l.go(case10));
		List<Integer> case11 = Arrays.asList(250,19,17,15,13,11,10,9,6,3,2,1,-455);
		System.out.println(l.go(case11));
		List<Integer> case12 = Arrays.asList(9,10,-8,10000,-5000,1000);
		System.out.println(l.go(case12));
	}
}