package controlstatements.selectionstatements;

import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int day;
     Scanner sc=new Scanner(System.in);
     
     System.out.println("enter the days b/w 0 to 6 days:");
     day=sc.nextInt();
     if(day==0)
     {
    	 System.out.println("sunday");
     }
     else if(day==1)
     {
    	 System.out.println("monday");
     }
     else if(day==2)
     {
    	 System.out.println("tuesday");
     }
     else if(day==3)
     {
    	 System.out.println("wednesday");
     }
     else if(day==4)
     {
    	 System.out.println("thursday");
     }
     else if(day==5)
     {
    	 System.out.println("friday");
     }
     else if(day==6) {
    	 System.out.println("saturday");
	}
     else {
    	System.out.println("wrong input");
     }
}
}
