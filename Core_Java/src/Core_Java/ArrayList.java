package Core_Java;

public class ArrayList {

	public static void main(String[] args) {

		java.util.ArrayList<String> a = new java.util.ArrayList<>();
		// Create object of the Class - Object.Method
		a.add("venkat");
		a.add("Pardha");
		a.add("Harika");
		a.add("Surya");
		a.add("Sai");
		a.add("Razzz");

		// removing string with index value
		a.remove(3);

		// we use get method to extract the value.
		System.out.println(a.get(2));

		System.out.println(a);

	}

}
