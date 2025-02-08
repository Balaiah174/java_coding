package Totalpatterns;

public class triangleb2 {
	public static void main(String[] args) {

		int rows = 5;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print((j%2==1?0:1)+" ");
			}
			System.out.println();
		}
	}
}
