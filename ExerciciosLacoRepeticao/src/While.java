import java.util.Scanner;

public class While {

	public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int idade, countMenoresDe21 = 0, countMaioresDe50 = 0;

        do {
            System.out.print("Digite uma idade ou um numero menor que 0 para encerrar: ");
            idade = leia.nextInt();

            if (idade >= 0) {
                if (idade < 21) {
                    countMenoresDe21++;
                } else if (idade > 50) {
                    countMaioresDe50++;
                }
            }
        } while (idade >= 0);

        System.out.printf("Total de pessoas menores de 21 anos: "+ countMenoresDe21 +" \n");
        System.out.printf("Total de pessoas maiores de 50 anos: "+countMaioresDe50 + "\n");

        leia.close();

	}

}
