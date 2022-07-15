package week1.day2.assignments;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "changeme";
		char[] str = test.toCharArray();
		char ch;
		int j = 2;

		for (int i = 0; i <= str.length - 1; i++) {
			if (i % j != 0) {
				ch = Character.toUpperCase(str[i]);
				System.out.println(ch);

			} else {
				System.out.println(str[i]);
			}
		}
	}
}
