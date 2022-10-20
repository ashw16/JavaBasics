package stringassignment;

public class SubString
{
	public static void main(String[] args)
	{

		String str = "liveonwildlifelife";
		System.out.println("String:" + str);
		int subStrCount = 0;
		String subString = "life";
		int index = 0;
		while ((index = str.indexOf(subString,index)) != -1) 
		{
			subStrCount++;
			index = index + subString.length();
		}
		System.out.println(" substring: " + subString + " found " + subStrCount + " times ");
	}

}
