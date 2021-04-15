import static java.lang.System.*;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Grid
{
   private String[][] grid;

   //load vals into the rows x cols grid randomly
	public Grid(int rows, int cols, String[] vals)
	{
		grid = new String[rows][cols];
		for (int i = 0; i < rows; i++)
			for (int j = 0; j < cols; j++)
				grid[i][j] = vals[(int) (Math.random() * vals.length)];
	}

	//find out which of the vals occurs the most
	public String findMax(String[] vals)
	{
		Integer[] counts = new Integer[vals.length];
		for (int i = 0; i < vals.length; i++)
		{
			counts[i] = 0;
			for (int j = 0; j < grid.length; j++)
			{
				for (int k = 0; k < grid[1].length; k++)
				{
					if (grid[j][k].equals(vals[i]))
					{
						counts[i] += 1;
					}
				}
			}
		}
		int index = 0;
		for (int i = 0; i < counts.length; i++)
		{
			if (counts[index] < counts[i]) counts[index] = counts[i];
		}
		return vals[index];
	}

	//returns a count of how many times val occurs in the matrix
	public int countVals( String val )
	{
		int count = 0;
		for (int j = 0; j < grid.length; j++)
		{
			for (int k = 0; k < grid[1].length; k++)
			{
				if (grid[j][k].equals(val))
				{
					count += 1;
				}
			}
		}
		return count;
	}

	//display the grid
	public String toString()
	{
		String output="";
		for (int j = 0; j < grid.length; j++)
		{
			for (int k = 0; k < grid[1].length; k++)
			{
				output += grid[j][k] + " ";
			}
			output += "\n";
		}
		return output;
	}
}