package week1.day2.assignments;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";
		int count = 0;
		String[] arr1 = text.split(" ");

		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i].equals("java")) {
				count = count + 1;
				if (count > 1) {
					arr1[i] = "";
				}
			}
			if (arr1[i] == "") {
				System.out.print("");
			} else {
				System.out.print(" " + arr1[i]);
			}
		}
	}

}
