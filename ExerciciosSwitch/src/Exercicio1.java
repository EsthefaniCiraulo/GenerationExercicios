import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        float numero1 = scanner.nextFloat();

        System.out.print("Digite o segundo número: ");
        float numero2 = scanner.nextFloat();

        System.out.print("Digite o código da operação (1-Soma, 2-Subtração, 3-Multiplicação, 4-Divisão): ");
        int codigoOperacao = scanner.nextInt();

        float resultado = 0;

        switch (codigoOperacao) {
            case 1:
                resultado = numero1 + numero2;
                break;
            case 2:
                resultado = numero1 - numero2;
                break;
            case 3:
                resultado = numero1 * numero2;
                break;
            case 4:
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                } else {
                    System.out.println("Operação Inválida! Não é possível dividir por zero.");
                    return;
                }
                break;
            default:
                System.out.println("Operação Inválida!");
                return;
        }

        System.out.println("O resultado da operação é: " + resultado);
	}

}
