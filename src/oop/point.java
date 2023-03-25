package oop;

public class point {
	private int x, y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	public point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public point() {
		x = 0; y = 0;
	}
	public point(point p) {
		x = p.x;
		y = p.y;
	}
	/**
	 * Khoang cach toi goc toa do O(0,0)
	 * @return Khoang cach d(P,O)
	 */
	public double Distance() {
		double d = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		return d;
	}
	/**
	 * Khoang cach toi diem P(x,y)
	 * @param D Diem can tinh khoang cach
	 * @return Khoang cach d(.,P)
	 */
	public double Distance2(point D) {
		double d = Math.sqrt(Math.pow(x-D.x, 2) + Math.pow(y-D.y, 2));
		return d;
	}
	public static double Distance(point a, point b) {
//		double d = Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
//		return d;
		return a.Distance2(b);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("(%d, %d)", x, y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
