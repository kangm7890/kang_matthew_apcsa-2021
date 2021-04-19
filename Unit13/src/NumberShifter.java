//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifter
{
	public static int[] makeLucky7Array(int size)
	{
		int[] arr = new int[size];
		for (int i = 0; i < size; i++)
		{
			arr[i] = (int) (Math.random() * 10) + 1;
		}
		shiftEm(arr);
		return arr;
	}
	public static void shiftEm(int[] array)
	{
		int sevencount = 0;
		for (int i = 0; i < array.length; i++)
		{
			for (int j = sevencount; j < array.length; j++)
			{
				if (array[j] == 7)
				{
					int temp = array[sevencount];
					array[sevencount] = 7;
					array[j] = temp;
					sevencount++;
				}
			}
		}
	}
}