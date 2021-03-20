//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;
import java.util.Arrays;

public class ToyStore
{
	private ArrayList<Toy> toyList;

	public ToyStore()
	{
		loadToys("");
	}
	
	public ToyStore(String toys)
	{
		loadToys(toys);
	}

	public void loadToys( String toys )
	{
        String[] ToysArr = toys.split(" ", 0);
        ArrayList<String> ToysAdded = new ArrayList<String>();
        for (int i = 0; i < ToysArr.length; i++)
        {
            if (ToysAdded.indexOf(ToysArr[i]) != -1)
            {
                Toy Toy = new Toy(ToysArr[i]);
                toyList.add(Toy);
                ToysAdded.add(ToysArr[i]);
            }
            else {
            	for (int j = 0; j < toyList.size(); j++)
            	{
           			if (ToysArr[i].equals(toyList.get(j).getName()))
           				toyList.get(j).setCount(toyList.get(j).getCount() + 1); 
           		}
            }
            
        }
	}
  
  	public Toy getThatToy( String nm )
  	{
  		return null;
  	}
  
  	public String getMostFrequentToy()
  	{
        int greatest = 0;
        String greatestName = "";
        for (int i = 0; i < toyList.size(); i++)
        {
            if (toyList.get(i).getCount() > greatest) {
            	greatest = toyList.get(i).getCount();
            	greatestName = toyList.get(i).getName();
            }
        }
        return greatestName;
  	}  
  
  	public void sortToysByCount()
  	{
  		ArrayList<Toy> sorted = new ArrayList<Toy>();
        for (int i = 0; i < toyList.size(); i++)
        {
            Toy greatest = new Toy();
            greatest.setCount(0);
            for (int j = 0; j < toyList.size(); j++) {
                if (toyList.get(j).getCount() > greatest.getCount()) {
                		greatest = toyList.get(j);
}
            }
            sorted.add(greatest);
            toyList.remove(greatest);
        }
        for (int i = 0; i < sorted.size(); i++)
            toyList.add(sorted.get(i));

  	}  
  	  
	public String toString()
	{
	   return toyList.toString();
	}
}