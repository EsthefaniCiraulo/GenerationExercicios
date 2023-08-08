
import java.util.ArrayList;
import java.util.Scanner;
    	
    public class Ex2 {

    	public static void main(String[] args) {
    			// TODO Auto-generated method stub
    		
            ArrayList<Integer> numeros = new ArrayList<>();
            numeros.add(2);
            numeros.add(5);
            numeros.add(1);
            numeros.add(3);
            numeros.add(4);
            numeros.add(9);
            numeros.add(7);
            numeros.add(8);
            numeros.add(10);
            numeros.add(6);
            
			Scanner scanner = new Scanner(System.in);

            System.out.println("List:");
            for (Integer num : numeros) {
                System.out.println(num);
            }

            System.out.println("\nDigite o número que você deseja encontrar:");
            int numeroBusca = scanner.nextInt();
            scanner.close();
            int posicaoEncontrada = -1;
            for (int i = 0; i < numeros.size(); i++) {
                if (numeros.get(i).equals(numeroBusca)) {
                    posicaoEncontrada = i;
                    break;
                }
            }

            if (posicaoEncontrada != -1) {
                System.out.println("\nO número " + numeroBusca + " está localizado na posição: " + posicaoEncontrada);
            } else {
                System.out.println("\nO número " + numeroBusca + " não foi encontrado!");
            }
        }
    }