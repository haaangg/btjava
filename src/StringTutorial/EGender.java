package StringTutorial;

public enum EGender {
	male, female , inf;
	public static EGender parse(String str) {
		int e = Integer.parseInt(str);
		return parse(e);
//		switch(e) {
//		case 0: return EGender.male;
//		case 1: return EGender.female;
//		case 2: return EGender.inf;
//		}
//		return EGender.inf;
	}
	public static EGender parse(int t) {
		return values() [t];
	}
}
