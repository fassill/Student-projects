package Proj1;

import java.util.Scanner;

public class production2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		System.out.println("please enter your name: ");
		String name = in.nextLine(); // be mindful of next(---)
		
		System.out.println("please enter your salary: ");
		int salary = in.nextInt();  // be mindful of next(---)
		
		System.out.println("please enter your bonus: ");
		double bonus = in.nextDouble(); // be mindful of next(---)
		
		double total_salary = salary+bonus;
		
		System.out.println("the name of the employee is:" + name);
		System.out.println("the salary of the employee is:" + salary);
		System.out.println("the bonus of the employee is:" + bonus);
		System.out.println("the total salary of the employee is:" + total_salary);
	}

}
