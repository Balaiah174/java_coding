package Totalpatterns;

public class trianglea {
	public static void main(String[] args) {
		int rows = 5;
		char a = 'A';
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(a + " ");
				a++;
			}
			System.out.println();

		}
	}

}
