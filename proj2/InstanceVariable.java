package proj2;

public class InstanceVariable {
	
	int age = 25;      //  <---- Declared outside methods
	public void methodone() {
		int i = 10;    //local variable
		System.out.println("value of i:"+i);
		System.out.println("value of age:"+age);
	}

	public void methodtwo() {
		int k = 30;    // local variable
		System.out.println("value of k:"+k);
		System.out.println("value of age:" +age);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InstanceVariable Iv = new InstanceVariable ();
		Iv.methodone();
		Iv.methodtwo();

	}

}
