package collection_list_assignment;
/*
Implement the assignment 1 using Linked List
*/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Assignment6 {

	LinkedList<Integer> li=new LinkedList<Integer>();
	
	  void saveEvenNumbers(int N)   
	  {
		  for(int i=2;i<=N;i++)
		  {
			  if(i%2==0)
			  {
				  li.add(i);
			  }
		  }
		//  System.out.println(li);
	  }
	void printEvenNumbers()
	{
		ArrayList<Integer> newli=new ArrayList<Integer>();
		for(int item:li)
		{
			newli.add(item*2);
			System.out.println(item*2);
		}
		//System.out.println(newli);
	}
	
	
public static void main(String[] args)
{
	 ArrayEvenNumbers obj=new  ArrayEvenNumbers();
	 obj.saveEvenNumbers(30);
	 obj.printEvenNumbers();
	}

}

