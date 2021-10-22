package blastoff;

import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String rev = "";
		
		System.out.println("Digite uma palavra: ");
		String palavra = scan.nextLine();
		
		
		for(int i = (palavra.length() - 1);i >= 0; i--) {
			rev += palavra.charAt(i);
		}
		
		if(rev.toLowerCase().equals(palavra.toLowerCase())) {
			System.out.println("É palindromo!!");
		}else {
			System.out.println("Não é palindromo!");
		}
		
	}
}
