package Proj9;

public class TryCatchNull {

	public static void main(String[] args) {
		try {
			
			int[] a = {4};
			System.out.println(a[1]);
			
	}  catch(NullPointerException e) {
		
		System.out.println("your array is null!");
 
	} catch(ArrayIndexOutOfBoundsException e) {
         System.out.println("your index is out of bounds!");
         
    } catch(Exception e) {
    	System.out.println("something else went wrong!");
    }
	
}
	
}
