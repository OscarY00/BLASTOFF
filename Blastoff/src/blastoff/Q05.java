package blastoff;

import java.util.Scanner;

public class Q05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Primeiro número: ");
		int x = scan.nextInt();
		System.out.println("Segundo número: ");
		int y = scan.nextInt();
		
		if((x % y == 0) || (y % x == 0)) {
			System.out.println("São Múltiplos!!");
		}else {
			System.out.println("Não são múltiplos!");
		}
	}
}
