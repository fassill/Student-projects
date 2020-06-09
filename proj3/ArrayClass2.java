package proj3;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] nameOfCommon = new String[60];  //0-59
		
		nameOfCommon[0] = "Fassil";
		nameOfCommon[1] = "Alemayhu";
		nameOfCommon[2] = "Hirut";
		nameOfCommon[3] = "Tena";
		nameOfCommon[4] = "Zemed";
		
		for(int i=0; i<nameOfCommon.length; i++) {
		
		System.out.println(nameOfCommon[i]);
		
	}
   
		System.out.println();
		
		char[] val = {'A','B','C','D'}; //0-3
		
		for(int k = 0; k<val.length; k++) {
		System.out.println(val[k]);
		}
		
		System.out.println();
		
		int[] ageOfStudent = {101, 11, 112, 13, 14, 15, 16, 17, 18, 19, 20};
		Arrays.sort(ageOfStudent);
		for(int n:ageOfStudent)
		{
			System.out.println(n);
		}
		
		System.out.println();
		
		for(int m=0; m<ageOfStudent.length; m++) {
			System.out.println(ageOfStudent[m]);
		}
	}

}
