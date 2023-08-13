package produto;

import java.util.Scanner;

import produto.model.Produto;
import produto.util.Cores;

public class Menu {

	public static void main(String[] args) {
		
		//Teste
		Produto produto = Produto.NovoProduto(1, 100, "Copo", "Copo de Vidro com detalhes bisotado", true, 2);
		produto.DetalharProduto();
		

		Scanner leia = new Scanner(System.in);

		int opcao;

		while (true) {

			System.out.println(Cores.TEXT_CYAN + Cores.ANSI_BLACK_BACKGROUND+"*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                 E-COMMERCE                          ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Cadastrar Produto                    ");
			System.out.println("            2 - Listar Produtos             	     ");
			System.out.println("            3 - Buscar Produtos pelo código          ");
			System.out.println("            4 - Editar Produto                       ");
			System.out.println("            5 - Excluir Produto                      ");
			System.out.println("            6 - Adicionar ao Carrinho                ");
			System.out.println("            7 - Remover do Carrinho                  ");
			System.out.println("            9 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");

			opcao = leia.nextInt();

			if (opcao == 9) {
				System.out.println("\nE-commerce Agradece sua Visita!");
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println("Criar Conta\n\n");

				break;
			case 2:
				System.out.println("Listar todas as Contas\n\n");

				break;
			case 3:
				System.out.println("Consultar dados da Conta - por número\n\n");

				break;
			case 4:
				System.out.println("Atualizar dados da Conta\n\n");

				break;
			case 5:
				System.out.println("Apagar a Conta\n\n");

				break;
			case 6:
				System.out.println("Saque\n\n");

				break;
			case 7:
				System.out.println("Depósito\n\n");

				break;
			case 8:
				System.out.println("Transferência entre Contas\n\n");

				break;
			default:
				System.out.println("\nOpção Inválida!\n");
				break;
			}
		}
	}
}