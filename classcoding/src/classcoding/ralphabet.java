package classcoding;

public class ralphabet {
	public static void main(String[] args) {
		int rows=5;

		for(int i=1;i<=5;i++) {
			char a=97;
			for(int j=i;j<=5;j++) {
				System.out.print(a++ +" ");
			}
	
			System.out.println();
		}
	}
}
