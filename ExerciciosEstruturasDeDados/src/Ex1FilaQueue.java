
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex1FilaQueue {
	
	public static void main(String[] args) {
  
        Queue<String> filaClientes = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\nMenu:");
            System.out.println("1: Adicionar um novo Cliente na fila");
            System.out.println("2: Listar Clientes na fila");
            System.out.println("3: Chamar uma pessoa da fila");
            System.out.println("0: Finalizar Programa.");

            System.out.print("\nDigite uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    System.out.print("\nDigite o nome: ");
                    String nomeCliente = scanner.nextLine();
                    filaClientes.add(nomeCliente);
                    System.out.println("\nFila:\n" + filaClientes);
                    System.out.println("Cliente Adicionado!");
                    break;

                case 2:
                    System.out.println("\nLista de Clientes na Fila:\n" + filaClientes);
                    break;

                case 3:
                    if (filaClientes.isEmpty()) {
                        System.out.println("\nA Fila está vazia!");
                    } else {
                        filaClientes.poll();
                        System.out.println("\nFila:\n" + filaClientes);
                        System.out.println("O Cliente foi Chamado!");
                    }
                    break;

                case 0:
                    System.out.println("\nPrograma Finalizado!");
                    break;

                default:
                    System.out.println("\nOpção inválida. Digite novamente!");
                    break;
            }
        }

        scanner.close();
    }
}
