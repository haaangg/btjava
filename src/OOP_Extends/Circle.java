package OOP_Extends;

import ltjv.mang;
import java.lang.Math;

public class Circle extends Shape {
	private double radius;
	public Circle() {
		super();
		radius = 1;
	}
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	public Circle(double radius, String color, boolean filled) {
		super(color, filled);
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		return Math.PI*Math.pow(radius, 2);
	}
	public double getPerimeter() {
		return 2*Math.PI*radius;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Circle[%s, radius=%.2f]", super.toString(), radius);
	}
}
