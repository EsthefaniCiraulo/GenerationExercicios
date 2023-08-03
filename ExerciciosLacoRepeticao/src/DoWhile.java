import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

        int numero, soma = 0;

        do {
            System.out.print("Digite um número ou 0 para finalizar a soma: ");
            numero = leia.nextInt();

            if (numero > 0) {
                soma += numero;
            }
        } while (numero != 0);

        System.out.printf("A soma dos números positivos é: "+soma+ "\n");

	}

}
