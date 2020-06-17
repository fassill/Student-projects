package proj8;

public class StringHandling7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		{
			String GDR = "I-left-it-all-in-Onepiece!";
			System.out.println();
			String[] GDRArray = GDR.split("-");
			System.out.println("Result");
			System.out.println("---------");
			System.out.println(GDR);
			
			for(int i=0; i<GDRArray.length; i++) {
				System.out.println("------------>" +GDRArray[i]);
			}
			
		}

	}

}
