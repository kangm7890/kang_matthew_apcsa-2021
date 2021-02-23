//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class Triples
{
   private int number;

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{
		setNum(num);
	}

	public void setNum(int num)
	{
		number = num;
	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int max = a;
		int GFC = 0;
		int[] nums = {a,b,c};
		for (int i = 0; i < nums.length; i++)
			if (nums[i] > max) max = nums[i];
		for (int i = 1; i <= max; i++)
			if (a%i == 0 && b%i == 0 && c%i == 0)
				GFC = i;
		return GFC;
	}

	public String toString()
	{
		String output="";
		int a, b, c;
		
		for (a = 1; a < number; a++)
		{
			for (b = a; b < number; b++)
			{
				for (c = b; c < number; c++)
				{
					if ((Math.pow(a, 2) + Math.pow(b, 2)) == Math.pow(c, 2) && greatestCommonFactor(a,b,c) == 1)
					{
						output += a + " " + b + " " + c + "\n";
					}
				}
			}
		}
		return output+"\n";
	}
}