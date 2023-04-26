package Core_Java;

public class Loops {

	public static void main(String[] args) {

		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		// System.out.println(arr[3]);

		// for loop

		for (int i = 0; i < arr.length; i++) {
			//System.out.println(arr[i]);
		}

		// for loop

		int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		for (int i = 0; i < arr1.length; i++) {
			//System.out.println(arr1[i]);
		}

		String[] names = { "venkat", "sai", "pardha", "harika", "surya", "lakshmi", "razz" };

		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
	}
}
