package ltjv;

import java.util.Scanner;
//test
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ct;
		do {
			System.out.println("\n\n=========================MENU=========================");
			System.out.println("\n[1] Phuong trinh bac 2");
			System.out.println("\n[2] Giai thua");
			System.out.println("\n[3] So fibonacci");
			System.out.println("\n[4] Tim uoc chung lon nhat va boi chung nho nhat");
			System.out.println("\n[5] Liet ke cac so nguyen to nho hon n");
			System.out.println("\n[6] Liet ke n so nguyen to dau tien");
			System.out.println("\n[7] Liet ke tat ca cac so nguyen to co 5 chu so");
			System.out.println("\n[8] Tinh tong cac chu so cua mot so nguyen n");
			System.out.println("\n[9] Liet ke tat ca cac so thuan nghich co 6 chu so");
			System.out.println("\n[10] Liet ke cac so fibonacci nho hon n la so nguyen to");
			System.out.println("\n[11] Thoat");
			System.out.println("\n\n===========================END===========================");
			
			System.out.println("\nChon chuong trinh: ");
			ct = sc.nextInt();
			switch (ct) {
			case 1: {
				System.out.println("Nhap a, b, c: ");
				double a = sc.nextDouble();
				double b = sc.nextDouble();
				double c = sc.nextDouble();
				Main.ptb2(a, b, c);
				break;
			}
			case 2: {
				System.out.println("Nhap n: ");
				int n = sc.nextInt();
				long g = Main.giaithua(n);
				System.out.println("Giai thua cua " + n + " la: " + g);
				break;
			}
			case 3: {
				System.out.println("Nhap n: ");
				int n = sc.nextInt();
				long f = Main.fibonacci(n);
				System.out.println("So Fibonacci thu " + n + " la: " + f);
				break;
			}
			case 4: {
				System.out.println("Nhap a, b: ");
				int a = sc.nextInt();
				int b = sc.nextInt();
				Main.ucln(a, b);
				Main.bcnn(a, b);
				break;
			}
			case 5: {
				System.out.println("Nhap n: ");
				int n = sc.nextInt();
				Main.lksnt1(n);
				break;
			}
			case 6: {
				System.out.println("Nhap n: ");
				int n = sc.nextInt();
				Main.lksnt2(n);
				break;
			}
			case 7: {
				int n = 0;
				Main.lksnt3(n);
				break;
			}
			case 8: {
				System.out.println("Nhap mot so nguyen n: ");
				int n = sc.nextInt();
				System.out.println("Tong cua cac chu so cua n la: " + tongchuso(n));
				break;
			}
			case 9: {
				System.out.println("Cac so thuan nghich co 6 chu so la: ");
				for(int i=100000; i<999999; i++) {
					if(thuannghich(i)==1) {
						System.out.println(i);
					}
				}
				break;
			}
			case 10: {
				System.out.println("Nhap so tu nhien n: ");
				int n = sc.nextInt();
				int i = 1;
				System.out.print("Cac so fibonacci nho hon n va la so nguyen to: ");
				while(fibonacci(i) < n) {
					int f=fibonacci(i);
					if(songuyento(f)==1) {
						System.out.printf(" %d ", f);
					}
					i++;
				}
				break;
			}
			case 11: {
				break;
			}
			default:
				System.out.println("Nhap lai! (1 <= chuong trinh <= 11)");
			}
		} while(ct!=11);
	}
	public static void ptb2(double a, double b, double c) {
		double x1, x2;
		double denta = b*b - 4*a*c;
		if (denta > 0) {
			x1 = (-b - Math.sqrt(denta))/(2*a);
			x2 = (-b + Math.sqrt(denta))/(2*a);
			System.out.println("Phuong trinh co 2 nghiem phan biet x1 = " + x1 + " , x2 = " + x2);
		} else if (denta == 0) {
			x1 = (-b) / (2*a);
			System.out.println("Phuong trinh co nghiem kep x1 = x2 = " + x1);
		} else {
			System.out.println("Phuong trinh vo nghiem");
		}
	}

	public static long giaithua(int n) {
		int ans = 0;
		for(int i=0; i<n; i++) {
			ans *= i;
		}
		return ans;
	}
	
	public static int fibonacci(int n) {
		if (n < 0) {
			return -1;
		} else if (n==0 || n==1) {
			return n;
		} else {
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}
	
	public static void ucln(double a, double b) {
		double uc;
		for(uc=a; uc>=1; uc--) {
			if(a%uc==0 && b%uc==0) {
				System.out.println("Uoc chung lon nhat la: " + uc);
				break;
			}
		}
	}
	public static void bcnn(double a, double b) {
		double bc;
		for (bc=a; bc<=a*b; bc++) {
			if (bc%a==0 && bc%b==0) {
				System.out.println("Boi chung nho nhat la: " + bc);
				break;
			}
		}
	}
	public static int songuyento(int n) {
		if (n<2) {
			return 0;
		}
		for (int i=2; i<=Math.sqrt(n); i++) {
			if (n%i==0) {
				return 0;
			}
		}
		return 1;
	}
	public static void lksnt1(int n) {
		for (int i=3; i<n; i+=2) {
			if (songuyento(i)==1) {
				System.out.println("So nguyen to nho hon n la " + i);
			}
		}
	}
	public static void lksnt2(int n) {
		int dem=0, i=2;
		while(dem!=n) {
			if(songuyento(i)==1) {
				System.out.println(n + " so nguyen to dau tien la " + i + " ");
				dem++;
			}
			i++;
		}
	}
	public static void lksnt3(int n) {
		for (int i=10000; i <=99999; i++) {
			if (songuyento(i)==1) {
				System.out.println("So nguyen to co 5 chu so la " + i);
			}
		}
	}
	public static long tongchuso(int n) {
		int sum = 0;
		while(n>0) {
			sum+=n%10;
			n=n/10;
		}
		return sum;
	}
	public static int thuannghich(int n) {
		int tam = n;
		int sum = 0;
		while(n!=0) {
			int d = n%10;
			sum = sum*10+d;
			n=n/10;
		}
		if (sum==tam) 
			return 1;
		else 
			return 0;
		
	}
	public static float[] NhapMang() {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap n: ");
		n = sc.nextInt();
		
		float mang[] = new float[n];
		for(int i=0; i<n; i++) {
			System.out.println("Nhap mang: " + i);
			mang[i] = sc.nextFloat();
		}
		return mang;
	}
	public static float tong(float[] mang) {
		float s = 0;
		for(int i=0; i<mang.length; i++) {
			s+=mang[i];
		}
		return s;
	}
	public static float TongSoNguyenTo(float[] mang) {
		float s = 0;
		for(int i=0; i<mang.length; i++) {
			int n = (int) mang[i];
			if (n==mang[i] && Main.songuyento(n)==1) {
					s+=n;
				}
		}
		return s;
	}
	static float min(float[] mang) {
		float m = Float.MAX_VALUE;
		for(int i=0; i<mang.length; i++) {
			if(m > mang[i]) {
				m = mang[i];
			}
		}
		return m;
	}
	static float max(float[] mang) {
		float m = Float.MIN_VALUE;
		for(int i=0; i<mang.length; i++) {
			if(m < mang[i]) {
				m = mang[i];
			}
		}
		return m;
	}
	static float average(float[] mang) {
		float s = tong(mang);
		return s/mang.length;
	}
	/**
	 * Tim min, max, average cua mot mang
	 * @param mang
	 * @return Gia tri min, max, average
	 */
	public static float[] MinMaxAve(float[] mang) {
		float[] rs = new float[3];
		rs[0] = min(mang);
		rs[1] = max(mang);
		rs[2] = average(mang);
		return rs;
	}
	public static float[][] NhapMaTran() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		float[][] a = new float[n][m];
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				a[i][j] = sc.nextFloat();
			}
		}
		return a;
	}
	public static void XuatMaTran(float[][] matrix, int n, int m) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				System.out.println(matrix[i][j] + " ");
			}
		}
	}
	public static void CongMaTran(float[][] m1, float[][] m2, int n, int m) {
		float m3[][] = new float[n][m];
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				m3[i][j] = m1[i][j] + m2[i][j];
			}
		}
		XuatMaTran(m3, n, m);
	}
}

