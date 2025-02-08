package Totalpatterns;

public class pyramidsamenumbers {
	public static void main(String[] args) {
		int rows = 5;
		
		for (int i = 1;i <= 5; i++) {
			for (int j = i; j <= 5; j++) {
				System.out.print(" ");
			}
			for (int k = i; k <= i; k++) {
				System.out.print(i+" ");
			}
			for (int l = 2; l <= i; l++) { 
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}
