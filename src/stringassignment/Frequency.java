package stringassignment;

public class Frequency {

	public static void main(String[] args)
{

		String str = "welcome in Edubridge family";
		int count = 0, length = 0, flag = 0;
        length=str.length();
		for (int i = 0; i < length; i++) {
			count = 0;
			for (int j = 0; j < length; j++)
				if (str.charAt(j) == str.charAt(i))
					count++;
			for (int k = 0; k < i; k++)
				if (str.charAt(k) == str.charAt(i))
					flag = 1;
			if (flag != 1)
				System.out.println(str.charAt(i) + ":" + count);
			flag = 0;
		}
	}
}
