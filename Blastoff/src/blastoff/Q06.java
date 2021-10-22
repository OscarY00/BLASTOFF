package blastoff;

import java.util.Scanner;

public class Q06 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double horaInicio = 0;
		double horaFim = 0;
		
		System.out.println("Horario de Inicio: ");
		horaInicio = scan.nextDouble();
		System.out.println("Horario de Termino: ");
		horaFim = scan.nextDouble();
		
		double tempo = horaFim - horaInicio;
		
		System.out.println("Tempo da partida: " + tempo);
		
	
	}
}
