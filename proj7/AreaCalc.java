package proj7;

class AreaCalc {
	
	public double calcArea(int length, int width) {
		double rectArea = length * width;
		return rectArea;
	}

	public double calcArea (int radius) {
		double circleArea = 3.14 * radius * radius;
		return circleArea;
	}
	
	public static void main(String[] args) {
		
		AreaCalc ar = new AreaCalc();
		double rarea = ar.calcArea(12, 14);
		
		System.out.println("Area of rectangle: " + rarea);
		
		double cArea = ar.calcArea(10);
		System.out.println("Area of circle: " + cArea);
		
	}
}
