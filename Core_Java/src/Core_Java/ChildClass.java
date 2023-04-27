package Core_Java;

public class ChildClass extends ParentClass {

	public static void main(String[] args) {
		ChildClass a = new ChildClass();
		a.audiosystem();
		a.brakes();
		a.Colour();
		a.engine();
	}

	public void engine() {
		System.out.println("Engine code is implemented sucessfully");
	}

	public void Colour() {
		System.out.println(Colour);
	}

}
