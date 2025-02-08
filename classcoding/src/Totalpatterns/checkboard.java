package Totalpatterns;

public class checkboard {
public static void main(String[] args) {
	int rows=8;
	int col=8;
	for(int i=0;i<8;i++) {
		for(int j=0;j<8;j++) {
			if((i+j)%2==0)
				System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.println();
	}
}
}
