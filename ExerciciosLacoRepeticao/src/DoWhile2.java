import java.util.Scanner;

public class DoWhile2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

        int numero, soma = 0, countMultiplosDe3 = 0;

        do {
            System.out.print("Digite um número ou digite 0 para encerrar: ");
            numero = leia.nextInt();

            if (numero % 3 == 0 && numero != 0) {
                soma += numero;
                countMultiplosDe3++;
            }
        } while (numero != 0);

        if (countMultiplosDe3 > 0) {
            double media = (double) soma / countMultiplosDe3;
            System.out.printf("A média de todos os números múltiplos de 3 é: "+media+"\n");
        } else {
            System.out.println("Não foram digitados números múltiplos de 3.");
        }

	}

}
