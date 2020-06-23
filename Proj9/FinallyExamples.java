package Proj9;

import java.util.Scanner;

public class FinallyExamples {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println(scan.next());
		
		try {
			
			System.out.println(scan.next());
			
		} catch (Exception e) {
			
			System.out.println(e);
		}finally {
			
			scan.close();
		}

	}

}
