package proj6;

public class BoxClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
				double volume;
				Box mybox = new Box ();
				mybox.width = 10;
				mybox.height = 20;
				mybox.depth = 30;
				volume = mybox.width * mybox.height * mybox.depth;
				
				System.out.println("Volume of box is: " + volume);

			

		
	}

}
