//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		//ask for name and size
		String name;
		int size;
		System.out.println("Enter 1st monster's name : ");
		name = keyboard.next();
		System.out.println("Enter 1st monster's size : ");
		size = keyboard.nextInt();
		//instantiate monster one
		Skeleton s1 = new Skeleton(name, size);
		//ask for name and size
		System.out.println("Enter 2nd monster's name : ");
		name = keyboard.next();
		System.out.println("Enter 2nd monster's size : ");
		size = keyboard.nextInt();
		//instantiate monster two
		Skeleton s2 = new Skeleton(name, size);
		System.out.println();
		System.out.println("Monster 1 - "+s1);
		System.out.println("Monster 2 - "+s2);
		System.out.println();
		if (s1.isBigger(s2)) System.out.println("Monster one is bigger than Monster two");
		else if (s1.isSmaller(s2)) System.out.println("Monster one is smaller than Monster two");
		else System.out.println("Monster one is the same size as Monster two");
		if (s1.namesTheSame(s2)) System.out.println("Monster one has the same name as Monster two");
		else System.out.println("Monster one does not have the same name as Monster two");
	}
}