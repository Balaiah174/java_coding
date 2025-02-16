package numbers;

public class LCM {
	public static void main(String[] args) {
		int a = 12;
		int b = 18;
		int product = a * b;
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;

		
		int temp1 = product / a;
		}
		System.out.println(product);
	}
	
}
