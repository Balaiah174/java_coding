package Totalpatterns;

public class doublehillpattern {
	public static void main(String[] args) {
		int rows =5;
		for(int i=0;i<5;i++) {
			for(int j=i;j<5;j++){
				System.out.print("*");
			}
			
			for (int k=0;k<i;k++) {
			System.out.print(" ");
			}
			for (int l=0;l<i;l++) {
				System.out.print(" ");
			}
			for (int m=i;m<5;m++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
	}
}
