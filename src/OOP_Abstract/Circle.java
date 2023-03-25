package OOP_Abstract;

public class Circle extends Shape {
	private double radius;
	
	@Override
	double getArea() {
		return Math.PI*Math.pow(radius, 2);
	}

	@Override
	double getPerimeter() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
