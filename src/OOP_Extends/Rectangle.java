package OOP_Extends;

public class Rectangle extends Shape {
	private double w, l;
	public double getW() {
		return w;
	}
	public void setW(double w) {
		this.w = w;
	}
	public double getL() {
		return l;
	}
	public void setL(double l) {
		this.l = l;
	}
	public Rectangle() {
		// TODO Auto-generated constructor stub
		super();
		w = l = 1;
	}
	public Rectangle(double w, double l) {
		super();
		this.w = w;
		this.l = l;
	}
	public Rectangle(double w, double l, String color, boolean filled) {
		super(color, filled);
		this.w = w;
		this.l = l;
	}
	public double getArea() {
		return w*l;
	}
	public double getPerimeter() {
		return (w+l)*2;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Rectangle[%s, w=%f, l=%f]", super.toString(), w, l);
	}
}
