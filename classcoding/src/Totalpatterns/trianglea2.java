package Totalpatterns;

public class trianglea2 {
	public static void main(String[] args) {
		int rows = 5;
		
		for (int i = 1; i <= rows; i++) {
			char a=(char)('A'+i-1);
			for (int j = 1; j <= i; j++) {
				System.out.print(a + " ");
				
			}
			System.out.println();

		}
	}
}
