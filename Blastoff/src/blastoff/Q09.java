package blastoff;

import java.util.Scanner;

public class Q09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		System.out.println("Digite um número: ");
		num = scan.nextInt();
		
		for(int i = 0;i<=10;i++) {
			System.out.println(num + " X "+ i + " = " + num*i);
		}
		
	}
	
}
