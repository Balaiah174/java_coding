package Totalpatterns;

public class trianglea1 {
	public static void main(String[] args) {
		int rows = 5;
		
		for (int i = 1; i <= rows; i++) {
			char a='A';
			for (int j = 1; j <= i; j++) {
				System.out.print(a + " ");
				a++;
			}
			System.out.println();

		}
	}

}
