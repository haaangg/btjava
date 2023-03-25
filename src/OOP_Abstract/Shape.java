package OOP_Abstract;

public abstract class Shape {
	protected String color;
	protected boolean filled;
	public Shape() {
		color = "red";
		filled = true;
	}
	public Shape(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	abstract double getArea();
	abstract double getPerimeter();
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Shape[color=%s, filled=%s]", color, filled);
	}
}
