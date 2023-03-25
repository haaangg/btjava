package ltjv;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;
import StringTutorial.Person;
import oop.*;
import KiemTraGiuaKi.MyDate;
public class mang {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		String input = "21T1020345|Ngo Van|Tuan|01/01/1995|TT Hue|1|Ha Noi";
//		Person p = Person.parse(input);
//		System.out.println(p.toString());
//		}
//	Generic
//	ArrayList<String> dsSV = new ArrayList<String> ();
//	dsSV.add("Dung");
//	dsSV.add("Tuan");
//	for(String x : dsSV) {
//		System.out.print();
//	}
//		String s1 = "21T1020345|Ngo Van|Tuan|01/01/1995|TT Hue|1|Ha Noi";
//		String [] netngo = s1.split("[|]");
//		for(String x : netngo) {
//			System.out.print(x + " ");
//		}
//		try {
//			File file = new File("D:\\sinhvien.txt");
//			Scanner scanner = new Scanner(file);
//			ArrayList<String> ls = new ArrayList<> ();
//			while(scanner.hasNext()) {
//				ls.add(scanner.nextLine());
//			}
//			ArrayList<Person> rs = Person.parse(ls);
//			for (Person person : rs) {
//				System.out.println(person.toString());
//			}
//			scanner.close();
//			
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			System.out.println("Loi khong tim thay file");
//			e.printStackTrace();
//		}
//		catch(Exception e) {
//			System.out.println("Loi khong xac dinh");
//			e.printStackTrace();
//		}
		String userName = "dungnguyen";
		String passWord = "123456";
		if (passWord.length()>=6) {
			User user = User.login(userName, passWord);
			if(user!=null) {
				System.out.println("Dang nhap thanh cong");
			} else {
				System.out.println("Dang nhap that bai");
			}
		} else {
			System.out.println("Mat khau qua ngan");
		}
		
	}
	static void Time() {
		Time time = new Time(2, 3, 59);
		System.out.println(time.toString());
	}
	static void InvoiceItem() {
		InvoiceItem i = new InvoiceItem("a", "zxc", 1, 1.2);
		System.out.println(i.toString());
	}
	
	static void Employee() {
		Employee e = new Employee(1, "Hang", "Ngo", 12);
		System.out.println(e.toString());
	}
	static void oop() {
		point p = new point();
		System.out.println("Toa do diem P la: " + p.toString());
		
		point q = new point(5,10);
		System.out.println("Toa do diem Q la: " + q.toString());
		
		point t = new point(q);
		System.out.println("Toa do diem T la: " + t.toString());
		
	}
	static void CB() {
	}
	
}

