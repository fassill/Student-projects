package proj7;

public class Box {
	double width;
	double height;
	double depth;
	Box(){
		width = 5;
		height = 10;
		depth = 3;
	}
	Box(double w, double h, double d){
		width = w;
		height = h;
		depth = d;
	}
	double volume() {
		return width * height * depth;
	}
}
