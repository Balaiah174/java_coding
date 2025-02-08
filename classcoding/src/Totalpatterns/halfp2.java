package Totalpatterns;

public class halfp2 {
	public static void main(String[] args) {
		
		
		int rows = 5;
		int col=1;
		for (int i = 1; i <= 5; i++) {
			for (int j = i; j <=5; j++) {
				System.out.print(col);
				col++;
				
			}
			System.out.println();
		}
	}
}
