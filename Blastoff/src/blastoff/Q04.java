package blastoff;

import java.util.Scanner;

public class Q04 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Temperatura em C°: ");
		int c = scan.nextInt();
		
		int x = c * 9/5 + 32;
		
		System.out.println("Temperatura em F°: " + x);
	}
}
