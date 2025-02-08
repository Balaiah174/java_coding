package classcoding;

public class triangleb {
	public static void main(String[] args) {
		int rows = 5;
		int col=0;
		for (int i = 1; i <= rows; i++) {
		
			for (int j = 1; j <= i; j++) {
				System.out.print(col + " ");
				col=(col==0);
			}
			System.out.println();

		}
	}
}
