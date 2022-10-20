package controlstatements.selectionstatements;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a,b,c;
       int max=0;
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the value of a:");
       a=sc.nextInt();
       System.out.println("enter the value of b:");
       b=sc.nextInt();
       System.out.println("enter the value of c:");
       c=sc.nextInt();
       
       if(a>b)
       {
    	   if(a>c)
    		   max=a;
    	   else
    		   max=c;
       }
       else 
       {
    	   if(b>c)
    		   max=b;
    	   else
    		   max=c;
       }
       System.out.println("max value="+max);
	}

}
