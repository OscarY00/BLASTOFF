package blastoff;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("a:");
		int a = scan.nextInt();
		System.out.println("b: ");
		int b = scan.nextInt();
		System.out.println("c: ");
		int c = scan.nextInt();
		
		if((a<b) && (a<c)) {
			System.out.println("a é o menor numero "+ a);
		}else if((b<a) && (b<c)) {
			System.out.println("b é o menor numero " + b);
		}else {
			System.out.println("c é o menor número " + c);
			}
	}
}
