package proj5;

public class ContinueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// for loop
		
		for(int i = 1; i <= 10; i++) {
			if(i == 5) {     // using continue statement 
				continue;    // it will skip the rest of the statement
			}
			
			System.out.print(i + " ");
		}

	}

}
