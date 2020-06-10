package proj5;

public class BreakLoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i = 0; i < 20; i++) {
			sum = sum + i;
			if(sum > 21) {
				break;     // terminate loop if sum is greater than 21
			
			}
			System.out.print(sum + " ");
		}    // end for statement

	}

}
