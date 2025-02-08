
package Totalpatterns;

public class daimondpattern {
public static void main(String[] args) {
	int n = 5;
	for (int i = 1; i <= n; i++) {
		for (int j = i; j < n; j++) {
		System.out.print(" ");
		}
		for (int k = 1; k <= i; k++) {
		System.out.print(k);
		}
		int num = i - 1;
		for (int l = 1; l < i; l++) {
		System.out.print(num);
		num--;
		}
		System.out.println();
		}
		for (int i = n - 1; i >= 1; i--) {
		for (int j = n; j > i; j--) {
		System.out.print(" ");
		}
		for (int k = 1; k <= i; k++) {
		System.out.print(k);
		}
		int num = i - 1;
		for (int l = 1; l < i; l++) {
		System.out.print(num);
		num--;
		}
		System.out.println();
		}
		}
		

}

