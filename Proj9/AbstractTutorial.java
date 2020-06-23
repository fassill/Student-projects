package Proj9;

abstract class Bike {
	
	String brand;
	
	public void run() {
		System.out.println("Running Safely!");
	}
	
	public abstract void vroom();
	
	public abstract void skrrt();
}

class Honda extends Bike{
	
	public void vroom() {
		System.out.println("Car goes!");
	}
	public void skrrt() {
		System.out.println("Car Stops!");
	}
}

public class AbstractTutorial {

	public static void main(String[] args) {
		Honda h = new Honda();
		
		h.run();
		h.vroom();
		h.skrrt();
		System.out.println(h.brand);
		

	}

}
