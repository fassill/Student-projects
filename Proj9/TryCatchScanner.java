package Proj9;

import java.util.Scanner;

public class TryCatchScanner {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
				System.out.println("What's your favorite numnber?");
				
				try {
				
				int n = scan.nextInt();
				System.out.println(n);
	} catch (Exception e) {
			System.out.println("Please enter a number");
			
      }

	}
}