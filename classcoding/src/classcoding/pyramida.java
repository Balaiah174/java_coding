package classcoding;

public class pyramida {
	public static void main(String[] args) {
		int rows = 5;
	char a=65;	
		for (int i = 1; i <= 5; i++) {
			for (int j = i; j <= 5; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(a++ +" ");
			}
			for (int l = 2; l <= i; l++) {
				System.out.print(a++ +" ");
			}
			System.out.println(); 
		}
	}
}
