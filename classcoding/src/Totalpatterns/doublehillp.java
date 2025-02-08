package Totalpatterns;

public class doublehillp {
	public static void main(String[] args) {
		int rows = 5;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}

			for (int k = i + 1; k < 5; k++) {
				System.out.print(" ");
			}
			for (int l = i + 1; l < 5; l++) {
				System.out.print(" ");
			}
			for (int m = 0; m <= i; m++) {
				System.out.print("*");
			}

			System.out.println();
		}

	}
}
