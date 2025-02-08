package Totalpatterns;

public class pyramidsnIN {
	public static void main(String[] args) {
		int rows = 5;
		
		for (int i = 1;i <= 5; i++) {
			int col=1;
			for (int j = i; j <= 5; j++) {
				System.out.print(" ");
			}
			for (int k = i; k <= i; k++) {
				System.out.print(col+" ");
				col++;
				
			}
			for (int l = 2; l <= i; l++) { 
				System.out.print(col+" ");
				col++;
			}
			System.out.println();
		}
	}
}
