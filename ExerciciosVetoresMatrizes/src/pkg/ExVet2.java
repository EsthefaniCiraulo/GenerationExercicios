package pkg;

 	import java.util.Scanner;

 	public class ExVet2 {

    public static void main(String[] args) {
    	// TODO Auto-generated method stub

        int[] vetor = new int[10];
        int tamanho = vetor.length;
        int soma = 0;
        double media;

        Scanner leia = new Scanner(System.in);

        // Ler os 10 números e armazená-los no vetor
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vetor[i] = leia.nextInt();
        }

        System.out.println("Elementos nos índices ímpares:");
        for (int i = 1; i < tamanho; i += 2) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();

        System.out.println("Elementos pares:");
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.print(vetor[i] + " ");
            }
        }
        System.out.println();

        // Calcular a soma de todos os elementos
        for (int i = 0; i < tamanho; i++) {
            soma += vetor[i];
        }

        // Calcular a média
        media = (double) soma / tamanho;

        System.out.println("Soma: " + soma);
        System.out.printf("Média: %.2f%n", media);
    }
}
