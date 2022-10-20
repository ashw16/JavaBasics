package stringassignment;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String s = " Welcome to Welcome Bike  Bike";
		StringBuilder str = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			int index = s.indexOf(ch, i + 1);
			if (index == -1) {
				str.append(ch);
			}
		}
		System.out.println("After removing duplicates:" + str);
	}

}
