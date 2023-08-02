import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        float saldo = 1000.00f;

        System.out.println("Seu saldo atual é: R$ " + saldo);

        System.out.print("Digite o código da operação (1-Saldo, 2-Saque, 3-Depósito): ");
        int codigoOperacao = scanner.nextInt();

        switch (codigoOperacao) {
            case 1:
                System.out.println("Seu saldo é: R$ " + saldo);
                break;
            case 2:
                System.out.print("Digite o valor a ser sacado: R$ ");
                float valorSaque = scanner.nextFloat();

                if (valorSaque <= saldo) {
                    saldo -= valorSaque;
                    System.out.println("Saque realizado com sucesso! Saldo atual: R$ " + saldo);
                } else {
                    System.out.println("Saldo insuficiente!");
                }
                break;
            case 3:
                System.out.print("Digite o valor a ser depositado: R$ ");
                float valorDeposito = scanner.nextFloat();

                saldo += valorDeposito;
                System.out.println("Depósito realizado com sucesso! Saldo atual: R$ " + saldo);
                break;
            default:
                System.out.println("Operação Inválida!");
                break;
        }

	}

}
