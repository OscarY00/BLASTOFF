package blastoff;

import java.util.Scanner;

public class Q05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Primeiro n�mero: ");
		int x = scan.nextInt();
		System.out.println("Segundo n�mero: ");
		int y = scan.nextInt();
		
		if((x % y == 0) || (y % x == 0)) {
			System.out.println("S�o M�ltiplos!!");
		}else {
			System.out.println("N�o s�o m�ltiplos!");
		}
	}
}
