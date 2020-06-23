package Proj9;

public class TryCatchExamples {

	public static void main(String[] args) {
		
		try {
		   int[] a = {4, 5, 1};
		   System.out.println(a[1]);
        } catch (Exception e) {
        	System.out.println("An exception happend!");
        }
    }

}