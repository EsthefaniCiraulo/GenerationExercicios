import java.util.Scanner;

public class For2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

        int numero, totalPares = 0, totalImpares = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.printf("Digite o %dº número: ", i);
            numero = leia.nextInt();

            if (numero % 2 == 0) {
                totalPares++;
            } else {
                totalImpares++;
            }
        }

        System.out.printf("Total de números pares: "+totalPares+ "\n");
        System.out.printf("Total de números ímpares: "+ totalImpares+"\n");

	}

}
