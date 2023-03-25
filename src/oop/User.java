package oop;

public class User {
	private String userName;
	private String passWord;
	public User(String userName, String passWord) {
		super();
		this.userName = userName;
		this.passWord = passWord;
	}
	public static User login(String uname, String pw) {
		if (uname.equalsIgnoreCase("dungnguyen") && pw.equals("123456")) {
			return new User(uname, pw);
		}
		return null;
	} 
}
