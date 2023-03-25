package oop;

public class Book_1 {
	private String name;
	private Author author;
	private double price;
	private int qty = 0;
	public Book_1(String name, Author author, double price) {
		super();
		this.name = name;
		this.author = author;
		this.price = price;
	}
	public Book_1(String name, Author author, double price, int qty) {
		super();
		this.name = name;
		this.author = author;
		this.price = price;
		this.qty = qty;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public String getName() {
		return name;
	}
	public Author getAuthor() {
		return author;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Book[name=%s, price=%f, qty=%d]", name, author.toString(), price, qty);
	}
}
