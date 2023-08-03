import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.print("Digite o primeiro número do intervalo: ");
		int primeiroNumero = leia.nextInt();

		System.out.print("Digite o último número do intervalo: ");
		int ultimoNumero = leia.nextInt();

		if (primeiroNumero >= ultimoNumero) {
			System.out.println("Intervalo inválido!");
			return;
		}

		System.out.printf("No Intervalo entre " + primeiroNumero + " e " + ultimoNumero + "\n");
		for (int i = primeiroNumero; i <= ultimoNumero; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.printf(i + " é múltiplo de 3 e 5\n");
			}
		}

	}

}
