package week1.day2.assignments;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "madam";
		String rev = "";
		int j = name.length();

		for (int i = (j - 1); i >= 0; i--) {
			rev = rev + name.charAt(i);
		}

		if (name.equalsIgnoreCase(rev)) {
			System.out.println(name + " is a Palindrome");
		} else {
			System.out.println(name + " is not a Palindrome");
		}
	}

}
