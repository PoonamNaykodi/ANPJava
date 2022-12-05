
public class Exception {
	static void display() {
		String data="123";
		int num=Integer.valueOf(data);
		System.out.println("num");
	}
	static void greet() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method");
		try {
			display();
		}
		catch(ArithmeticException e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}

}
