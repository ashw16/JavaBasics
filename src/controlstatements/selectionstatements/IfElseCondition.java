package controlstatements.selectionstatements;

import java.util.Scanner;

public class IfElseCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int marks;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter your marks:");
      marks=sc.nextInt();
      
      if(marks>35)
      {
    	  System.out.println("your are pass");
      }
      else
      {
    	  System.out.println("you are fail");
      }
	}

}
