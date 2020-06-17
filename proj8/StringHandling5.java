package proj8;

public class StringHandling5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Yonko = "1 Big Mom 2 Kaido 3 Shanks 4 Kurohige";
			char big;
			for(int i = 0; i<Yonko.length();i++)
			{
					big = Yonko.charAt(i);
					System.out.println(big);
					if(Character.isLetter(big)) {
						continue;
					}
					else {
						System.out.println("String contains not a letter");
					}
			}

	}

}
