package proj8;

public class StringHandling6 {
	
	public static String BB = "A Man's Dreams Never Ends!";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int len_value = BB.indexOf("Dreams");
		System.out.println(BB);
		System.out.println("A crew of :" + len_value);
		System.out.println(BB.subSequence(15, 26));

	}
}
