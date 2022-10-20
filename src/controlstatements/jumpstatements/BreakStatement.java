package controlstatements.jumpstatements;

public class BreakStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//break stmt is used to jump out of a loop
		int i=1;
		while(i<=10) {
			System.out.println(i);
			i++;
			if(i==5)
			{
				break;
			}
		}
		

	}

}
