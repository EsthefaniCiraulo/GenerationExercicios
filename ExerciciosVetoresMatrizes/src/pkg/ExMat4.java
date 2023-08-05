package pkg;

import java.util.Scanner;

public class ExMat4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 double[][] notas = new double[10][4];
	        double[] medias = new double[10];

	        Scanner leia = new Scanner(System.in);

	        // Ler as notas de cada participante em cada bimestre
	        for (int i = 0; i < 10; i++) {
	            for (int j = 0; j < 4; j++) {
	                System.out.print("Digite a nota do participante " + (i + 1) + " no " + (j + 1) + "º bimestre: ");
	                notas[i][j] = leia.nextDouble();
	            }
	        }

	        // Calcular a média de cada participante
	        for (int i = 0; i < 10; i++) {
	            double soma = 0;
	            for (int j = 0; j < 4; j++) {
	                soma += notas[i][j];
	            }
	            medias[i] = soma / 4;
	        }

	        // Exibir as médias de cada participante
	        System.out.println("\nMédias de cada participante:");
	        for (int i = 0; i < 10; i++) {
	            System.out.printf("Participante %d: %.1f%n", (i + 1), medias[i]);
	        }
	    }
	}