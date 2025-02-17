package numbers;

public class stringlowercase {

	public void m1() {
		String s = "JAVa";
		String s1 = s.toLowerCase();
		System.out.println(s1);
	}

	public void m2() {
		String s = "JaVa";
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] > 65 && ch[i] <= 90) {
				ch[i] += 32;
			}
		}
		System.out.println(ch);
	}

	public static void main(String[] args) {
		stringlowercase s = new stringlowercase();
		s.m1();
		s.m2();
	}
}
