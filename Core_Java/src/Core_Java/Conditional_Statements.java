package Core_Java;

public class Conditional_Statements {

	public static void main(String[] args) {

		// Using Conditional Statements Inside the Loops

		int[] arr2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		for (int i = 0; i < arr2.length; i++) {

			// Numbers Divided By 2

			if (arr2[i] % 2 == 0) {
				System.out.println(arr2[i] + "is Divided By 2");
				// break;
			} else {
				System.out.println(arr2[i] + "is not Divided By 2");
			}

		}
	}
}
