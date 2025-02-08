package Totalpatterns;

public class pyramidsameA {

	public static void main(String[] args) {
		int rows = 5;
		
		for (int i = 1;i <= 5; i++) {
			for (int j = i; j <= 5; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print((char)('A'+k-1)+" ");
				
			}
			for (int l = 2; l >= l; l--) { 
				System.out.print((char)('A'+l-1)+" ");
				
			}
			System.out.println();
		}
	}
}
