//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;

	public Doggies(int size)
	{
		//point pups at a new arry of Dog
		pups = new Dog[size];
	}
	
	public void set(int spot, int age, String name)
	{
		//put a new Dog in the array at spot 
		//make sure spot is in bounds
		Dog Dog = new Dog(age, name);
		pups[spot] = Dog;
	}

	public String getNameOfOldest()
	{
        int oldest = 0;
        String oldestName = "";
        for (int i = 0; i < pups.length; i++)
        {
            if (pups[i].getAge() > oldest) {
            	oldest = pups[i].getAge();
            	oldestName = pups[i].getName();
            }
        }
        return oldestName;
	}

	public String getNameOfYoungest()
	{
        int youngest = pups[0].getAge();
        String youngestName = "";
        for (int i = 0; i < pups.length; i++)
        {
            if (pups[i].getAge() < youngest) {
            	youngest = pups[i].getAge();
            	youngestName = pups[i].getName();
            }
        }
        return youngestName;
	}

	public String toString()
	{
		return ""+Arrays.toString(pups);
	}
}