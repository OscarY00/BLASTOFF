package blastoff;

import java.util.Scanner;

public class Q08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int t = 0;
		
		System.out.println("Digite um n�mero: ");
		int num = scan.nextInt();
		
		for(int i = 2;i<num;i++) {
			if(num % 2 == 0) {
				t = 1;
			}else {
				t = 0;
			}
		}
		if(t==1) {
			System.out.println("N�o � Primo");
		}else {
			System.out.println("� Primo");
		}
	}
}
