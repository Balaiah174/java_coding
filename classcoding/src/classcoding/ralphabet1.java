package classcoding;

public class ralphabet1 {
	public static void main(String[] args) {
		int rows=5;
char a=97;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(a++ +" ");
			}
		a=97;
			System.out.println();
		}
	}
}
