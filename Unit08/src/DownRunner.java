//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class DownRunner
{
	public static void main( String args[] )
	{											
		RayDown h = new RayDown();
		int[] case1 = {-99, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12345};
		System.out.println(h.go(case1));
		int[] case2 = {10,9,8,7,6,5,4,3,2,1,-99};
		System.out.println(h.go(case2));
		int[] case3 = {10,20,30,40,50,-11818,40,30,20,10};
		System.out.println(h.go(case3));
		int[] case4 = {32767};
		System.out.println(h.go(case4));
		int[] case5 = {255,255};
		System.out.println(h.go(case5));
		int[] case6 = {9,10,-88,100,-555,1000};
		System.out.println(h.go(case6));
		int[] case7 = {10,10,10,11,456};
		System.out.println(h.go(case7));
		int[] case8 = {-111,1,2,3,9,11,20,30};
		System.out.println(h.go(case8));
		int[] case9 = {9,8,7,6,5,4,3,2,0,-2,-989};
		System.out.println(h.go(case9));
		int[] case10 = {12,15,18,21,23,1000};
		System.out.println(h.go(case10));
		int[] case11 = {250,19,17,15,13,11,10,9,6,3,2,1,-455};
		System.out.println(h.go(case11));
		int[] case12 = {9,10,-8,10000,-5000,1000};
		System.out.println(h.go(case12));
	}
}