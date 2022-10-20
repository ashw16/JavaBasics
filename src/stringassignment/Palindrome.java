package stringassignment;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		String s="";
		String rev="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String you want to check:");
		s=sc.nextLine();
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
			
		}
		if(s.equals(rev))
		{
			System.out.println("The string is palindrome");
		}
		else
		{
			System.out.println("The string is not palindrome");
		}
	}

}
