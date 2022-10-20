package operators;

public class AssignmentOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int a=7,b=8;
          System.out.println("addition assgnmnt opr is:"+(b+=a)); // b=b+a
          System.out.println("subtraction assgnmnt opr is:"+(b-=a));
          System.out.println("mul assgnmnt opr is:"+(b*=a));
          System.out.println("div assgnmnt opr is:"+(b/=a));
          System.out.println("modulus assgnmnt opr is:"+(b%=a));
          System.out.println("and assgnmnt opr is:"+(b&=a));
          System.out.println("or assgnmnt opr is:"+(b|=a));
          System.out.println("xor assgnmnt opr is:"+(b^=a));
	}

}
