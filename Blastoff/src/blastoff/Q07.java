package blastoff;

import java.util.Scanner;

public class Q07 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Quantidade de itens da lista: ");
		int t = scan.nextInt();

		int[] lista1 = new int[t];
		int[] lista2 = new int[t];

		for (int i = 0; i < t; i++) {
			System.out.println("Digite o " + (i + 1) + "º valor");

			lista1[i] = scan.nextInt();
			if ((lista1[i] % 2) == 0) {
				lista2[i] = lista1[i];
			}
		}
		for (int x = 0; x < lista2.length; x++) {
			if (lista2[x] != 0) {
				System.out.print(lista2[x] + " ");
			}
		}

	}
}
