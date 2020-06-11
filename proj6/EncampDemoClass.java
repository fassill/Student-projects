package proj6;

public class EncampDemoClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EncapsulationDemo encap = new EncapsulationDemo();
		
		
		encap.setFname("Fassil");
		encap.setLname("Alemayhu");
		encap.setAge(18);
		encap.setSalry(300000);
		encap.setBonus(2000);
		
		System.out.println(encap.getFname());
		System.out.println(encap.getLname());
		System.out.println(encap.getAge());
		System.out.println(encap.getSalry());
		System.out.println(encap.getBonus());

	}

}
