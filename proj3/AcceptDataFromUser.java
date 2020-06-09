package proj3;

import java.util.Scanner;

public class AcceptDataFromUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner (System.in);
		System.out.println("please enter the sisze of an array:");
		
	    int arraySize = in.nextInt();
	    
	    String [] nameOfStudent = new String [arraySize];
	    
	    System.out.println("please enter the elements of an array ");
	    
	    for(int i = 0; i<nameOfStudent.length; i++)
	    {
	    	System.out.println("The element at index :" + i + " is " + (nameOfStudent[i]= in.next()));
	    }
	    
	    System.out.println();

//		for(String elt:nameOfStudent) {
//         System.out.println(elt);
//		}
	    
	    for(int j = 0; j<nameOfStudent.length; j++)
	    {
	    	System.out.println(nameOfStudent [j]);
	    }
	}

}
