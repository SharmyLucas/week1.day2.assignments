package week1.day2.assignments;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "I am a software tester";
		String[] arr1 = test.split(" ");

		for (int i = 0; i < arr1.length; i++) {
			int j = i + 1;
			if (j % 2 == 0) {
				for (int n = arr1[i].length() - 1; n >= 0; n--) {
					System.out.print(arr1[i].charAt(n));
				}
				System.out.print(" ");
			} else {
				System.out.print(arr1[i] + " ");
			}
		}
	}

}
