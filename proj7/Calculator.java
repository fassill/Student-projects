package proj7;

public class Calculator {
	
	public static int add (int a, int b) {
		return a+b;
	}
	
	public static int multi(int a, int b) {
		return a * b;
	}
	
	public static int sub(int a, int b) {
		return a - b;
	}
	
	public static double div(int a, int b) {
		return a / b;
	}
	
	public static double mod(int a, int b) {
		return a % b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Calculator.add(15, 24));
		System.out.println(Calculator.multi(15,24));
		System.out.println(Calculator.sub(24, 15));
		System.out.println(Calculator.div(24, 4));
		System.out.println(Calculator.mod(24, 2));

	}

}
