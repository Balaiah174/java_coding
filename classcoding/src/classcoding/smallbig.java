package classcoding;

public class smallbig {

	public static void main(String[] args) {
		int rows=5;
      
		for(int i=1;i<=5;i++) {
			char c='A';
			for(int j=1;j<=i;j++) {
							
				
				if(j % 2==0) {
					System.out.print(Character.toLowerCase(c)+" ");
		
			}
				else {
					System.out.print(c+ " ");
				}
			c++;	
			}
			
			
				 
			System.out.println();
		}
	}
}

