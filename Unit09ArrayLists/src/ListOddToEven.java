//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	public static int go( List<Integer> ray )
	{
		int distance = 0;
		int longestdistance = -1;
		for (int i = 0; i < ray.size(); i++)
		{
			if (ray.get(i) % 2 == 1)
			{
				for (int j = i; j < ray.size(); j++)
				{
					if (ray.get(j) % 2 == 1)
					{
						distance++;
					} else if (ray.get(j) % 2 == 0)
					{
						longestdistance = distance;
						distance++;
					}
					else distance++;
				}
				return longestdistance;
			}
		}
		return -1;
	}
}