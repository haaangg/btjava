package oop;

public class Book_2 {
	private String name;
	private Author[] authors;
	private double price;
	private int qty = 0;
	public Book_2(String name, Author[] authors, double price) {
		super();
		this.name = name;
		this.authors = authors;
		this.price = price;
	}
	public Book_2(String name, Author[] authors, double price, int qty) {
		super();
		this.name = name;
		this.authors = authors;
		this.price = price;
		this.qty = qty;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getPty() {
		return qty;
	}
	public void setPty(int pty) {
		this.qty = pty;
	}
	public String getName() {
		return name;
	}
	public Author[] getAuthors() {
		return authors;
	}
	
//	public String[] getAuthorNames() {
//		String[] rs = "";
//		for (Author author : authors) {
//			rs += author.getName() + ",";
//		}
//		if (!rs.isEmpty()) {
//			rs = rs.substring(0, rs.length-1);
//		}
//		return rs;
//	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String authorString = "";
		for (Author author : authors) {
			authorString += author.toString() + ",";
		}
		if (!authorString.isEmpty()) {
			authorString = authorString.substring(0, authorString.length()-1);
		}
		return String.format("Book[name=%s, authors={%s}, price=%f, qty=%d", name, authorString, price, qty);
	}
}
