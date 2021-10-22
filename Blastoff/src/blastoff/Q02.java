package blastoff;

import java.util.Scanner;

public class Q02 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Distância: ");
		double distancia = scan.nextDouble();
		
		System.out.println("Gasto combustivel: ");
		double consumo = scan.nextDouble();
		
		double gm = distancia/consumo;
		System.out.println("Consumo médio: " + gm);
	}
}