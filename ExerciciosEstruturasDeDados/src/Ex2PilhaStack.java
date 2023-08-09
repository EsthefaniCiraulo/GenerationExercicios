
import java.util.Stack;
import java.util.Scanner;

public class Ex2PilhaStack {

	public static void main(String[] args) {
		
        Stack<String> pilhaLivros = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\nMenu:");
            System.out.println("1: Adicionar um novo livro na pilha");
            System.out.println("2: Listar todos os livros da pilha");
            System.out.println("3: Retirar um livro da pilha");
            System.out.println("0: Finalizar Programa.");

            System.out.print("\nDigite uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    System.out.print("\nDigite o nome: ");
                    String nomeLivro = scanner.nextLine();
                    pilhaLivros.push(nomeLivro);
                    System.out.println("\nPilha:\n" + pilhaLivros);
                    System.out.println("Livro adicionado!");
                    break;

                case 2:
                    System.out.println("\nLista de Livros na Pilha:\n" + pilhaLivros);
                    break;

                case 3:
                    if (pilhaLivros.isEmpty()) {
                        System.out.println("\nA Pilha está vazia!");
                    } else {
                        pilhaLivros.pop();
                        System.out.println("\nPilha:\n" + pilhaLivros);
                        System.out.println("Um Livro foi retirado da pilha!");
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