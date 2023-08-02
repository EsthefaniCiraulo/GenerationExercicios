import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        String par, positivo = "";
        
        if (numero % 2 == 0) {
        	par= "par";
        } else {
            par="ímpar";
        }
        
        if (numero >= 0) {
        	positivo =  "positivo";
        } else {
        	positivo =  "negativo";
        }

        System.out.println(numero + " é " + par + " e " + positivo);

	}

}
