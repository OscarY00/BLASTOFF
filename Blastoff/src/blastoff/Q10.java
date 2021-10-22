package blastoff;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um número: ");
		int num = scan.nextInt();
		int fat = 0;

		for (fat = 1; num > 1; num --) {
			fat *= num;
		}
		System.out.println(fat);

	}
}
