
public class ExVet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] vetor = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
        int tamanho = vetor.length;
        
        Scanner leia = new Scanner(System.in);

        System.out.println("0 1 2 3 4 5 6 7 8 9");
        exibirVetor(vetor); // Função para exibir o vetor original
        
        System.out.print("Digite o número que você deseja encontrar: ");
        int numeroDesejado = leia.nextInt();

        boolean encontrado = false;
        int posicao = -1;

        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] == numeroDesejado) {
                encontrado = true;
                posicao = i;
                break;
            }
        }

        if (encontrado) {
            System.out.println("O número " + numeroDesejado + " está localizado na posição: " + posicao);
        } else {
            System.out.println("O número " + numeroDesejado + " não foi encontrado!");
        }
    }

    public static void exibirVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
}