package controlstatements.looping;

public class SumOfEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int n=50,even=0,odd=0;
 
 
 for(int i=1;i<=n;i++)
 {
	 if(i%2==0)
	 {
		 even=even+i;
		// System.out.println(i);
		 
	 }
	 else {
		 odd=odd+i;
	 }
 }
 System.out.println("sum of even numbers:"+even);
 System.out.println("sum of odd numbers:"+odd);
	}

}




