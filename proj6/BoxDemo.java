package proj6;

class BoxDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double vol;
		Box2 mybox1 = new Box2();
		mybox1. setDim(10, 20, 5);
		vol = mybox1.volume();
		
		System.out.println(vol);

	}

}
