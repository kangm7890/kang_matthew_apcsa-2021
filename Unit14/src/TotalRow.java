//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;

public class TotalRow
{
    public static List<Integer> getRowTotals( int[][] m )
    {
    	//add code here
    	int count;
    	ArrayList<Integer> totals = new ArrayList<Integer>();
    	for (int j = 0; j < m.length; j++)
    	{
    		count = 0;
    		for (int k = 0; k < m[j].length; k++)
    		{
    			count += m[j][k];
    		}
    		totals.add(count);
    	}
		return totals;
    }
}
