package controlstatements.jumpstatements;

public class ReturnStatement {
        public int show(int c,int d)
        {
        	return c+d;
        }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       // immediately terminates the method in which it is executed
		int a=12;
		ReturnStatement obj=new ReturnStatement();
		System.out.println(obj.show(10, 20));
		System.out.println(a);
	}

}
