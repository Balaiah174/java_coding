package Totalpatterns;

public class pyramidsamein {
	public static void main(String[] args) {
		int rows = 5;
		
		for (int i = 1;i <= 5; i++) {
			for (int j = i; j <= 5; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(k+" ");
			}
			for (int l = i; l >=1 ; l--) { 
				System.out.print(l+" ");
			}
			System.out.println();
		}
	}
}
