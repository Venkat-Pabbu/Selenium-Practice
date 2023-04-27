package Core_Java;

public class Methods {

	public static void main(String[] args) {
		// this method is present in same class.
		Methods a = new Methods();
		String name = a.getData();
		System.out.println(name);

		// this method is present in different class.
		Strings aa = new Strings();
		aa.userData();

	}

	public String getData() {
		System.out.println("Hello Venkat");
		return "Venkat Pabbu";
	}

}
