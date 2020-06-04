package proj2;

public class localVariable {
	
	public void methodone() {
		int j = 25;          //  <-------- local variable
		System.out.println("Value of j:"+j);
	}

	public void methodtwo() {
		int k = 30;          //  <----------local variable
		System.out.println("Value of k:"+k);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		localVariable lv = new localVariable();
		lv.methodone();
		lv.methodtwo();
	}

}
