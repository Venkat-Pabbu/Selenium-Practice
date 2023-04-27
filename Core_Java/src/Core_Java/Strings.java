package Core_Java;

public class Strings {

	@SuppressWarnings("unused")
	public static void main(java.lang.String[] args) {

		// String is an Object that represents the sequence of Characters.

		// 1st way -- String Literal.
		String aa = "Harika";
		String aaa = "Pardha";

		// 2nd way -- using new memory allocate operator.
		String b = new String("innojc");
		String bb = new String("innojc");

		String a = "Venkat Vinay Pabbu";
		String[] SplittedString = a.split("Vinay");

		//System.out.println(SplittedString[0]);
		//System.out.println(SplittedString[1]);
		//System.out.println(SplittedString[1].trim());
		

		// Printing String in Reverse order
		for (int i = a.length() - 1; i >= 0; i--) {
			System.out.print("\'"+a.charAt(i));
		}
		
		
		// Printing String in normal order
		for (int i = 0; i < a.length(); i++) {
			System.out.print("\'"+a.charAt(i));
		}

	}
	public void userData() {
		System.out.println("Welcome to Pabbu's World");
	}

}
