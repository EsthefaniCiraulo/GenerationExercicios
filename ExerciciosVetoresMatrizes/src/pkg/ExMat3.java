package pkg;

import java.util.Scanner;

public class ExMat3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        int[][] matriz = new int[3][3];

		        Scanner leia = new Scanner(System.in);

		        // Ler os elementos da matriz 3x3
		        for (int i = 0; i < 3; i++) {
		            for (int j = 0; j < 3; j++) {
		                System.out.print("Digite o elemento [" + i + "][" + j + "]: ");
		                matriz[i][j] = leia.nextInt();
		            }
		        }

		        // Exibir os elementos da Diagonal Principal
		        System.out.println("Elementos da Diagonal Principal:");
		        for (int i = 0; i < 3; i++) {
		            System.out.print(matriz[i][i] + " ");
		        }
		        System.out.println();

		        // Exibir os elementos da Diagonal Secundária
		        System.out.println("Elementos da Diagonal Secundária:");
		        for (int i = 0; i < 3; i++) {
		            System.out.print(matriz[i][2 - i] + " ");
		        }
		        System.out.println();

		        // Calcular a Soma dos Elementos da Diagonal Principal
		        int somaDiagonalPrincipal = 0;
		        for (int i = 0; i < 3; i++) {
		            somaDiagonalPrincipal += matriz[i][i];
		        }

		        // Calcular a Soma dos Elementos da Diagonal Secundária
		        int somaDiagonalSecundaria = 0;
		        for (int i = 0; i < 3; i++) {
		            somaDiagonalSecundaria += matriz[i][2 - i];
		        }

		        // Exibir a Soma dos Elementos da Diagonal Principal e Secundária
		        System.out.println("Soma dos Elementos da Diagonal Principal: " + somaDiagonalPrincipal);
		        System.out.println("Soma dos Elementos da Diagonal Secundária: " + somaDiagonalSecundaria);
		    }
		}