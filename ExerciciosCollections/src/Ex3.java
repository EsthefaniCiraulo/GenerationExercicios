
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Ex3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub    	
    	
        Set<Integer> numerosSet = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 10 valores inteiros não repetidos:");

        for (int i = 0; i < 10; i++) {
            int numero = scanner.nextInt();
            numerosSet.add(numero);
        }

        System.out.println("\nListar dados do Set:");
        
        Iterator<Integer> iterator = numerosSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        scanner.close();
    }
}
