package blastoff;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int I = scan.nextInt();
		int J = scan.nextInt();
		int K = scan.nextInt();
		int X = scan.nextInt();
		int Y = scan.nextInt();
		
		int media = (I+J+K+X+Y)/5;
		
		System.out.println( "Média: " + media);
		
	}
}
