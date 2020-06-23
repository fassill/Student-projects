package Proj9;

interface Book{
	String color = "Red";
	
	String length = "565 pages";
	
	void openUp();
	void closeUp();
}

public class InterfacePractice implements Book {

	public static void main(String[] args) {
		System.out.println(color);
		System.out.println(length);

		InterfacePractice ex = new InterfacePractice();
		ex.openUp();
		ex.closeUp();
	}

	@Override
	public void openUp() {
		System.out.println("It is opened!");
		
	}

	@Override
	public void closeUp() {
		System.out.println("it is closed!");
		
	}

}
