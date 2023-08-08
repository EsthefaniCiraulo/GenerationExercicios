
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub    	
    	
        Set<Integer> numerosSet = new HashSet<>();

        numerosSet.add(2);
        numerosSet.add(5);
        numerosSet.add(1);
        numerosSet.add(3);
        numerosSet.add(4);
        numerosSet.add(9);
        numerosSet.add(7);
        numerosSet.add(8);
        numerosSet.add(10);
        numerosSet.add(6);
        
        
        System.out.println("List:");
        for (Integer num : numerosSet) {
            System.out.println(num);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nDigite o número que você deseja encontrar:");
        int numeroBusca = scanner.nextInt();

        if (numerosSet.contains(numeroBusca)) {
            System.out.println("\nO número " + numeroBusca + " foi encontrado!");
        } else {
            System.out.println("\nO número " + numeroBusca + " não foi encontrado!");
        }
        scanner.close();
    }
}
