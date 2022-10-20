package controlstatements.jumpstatements;

public class ContinueStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       // breaks one iteration in the loop, if a specified condition occurs and continues with the 
		// next iteration
		int n=10;
		for(int i=0;i<n;i++)
		{
			if(i==4)
			{
				continue;
			}
			System.out.println(i);
		}
	}

}
