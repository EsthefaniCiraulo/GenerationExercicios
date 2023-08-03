import java.util.Scanner;

public class While2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

        int idade, sexo, categoria;
        int backend = 0, frontendMulher = 0, mobileHomemMaior40 = 0, fullstackMulherMenor30 = 0;
        char continuar;

        do {
            System.out.print("Idade: ");
            idade = leia.nextInt();

            System.out.println("Sexo:");
            System.out.println("1 – Masculino");
            System.out.println("2 – Feminino");
            System.out.println("3 – Outros");
            System.out.print("Opção: ");
            sexo = leia.nextInt();

            System.out.println("Categoria:");
            System.out.println("1 – Backend");
            System.out.println("2 – Frontend");
            System.out.println("3 – Mobile");
            System.out.println("4 – FullStack");
            System.out.print("Opção: ");
            categoria = leia.nextInt();

            if (categoria == 1) {
                backend++;
            } else if (categoria == 2 && sexo == 2) {
                frontendMulher++;
            } else if (categoria == 3 && sexo == 1 && idade > 40) {
                mobileHomemMaior40++;
            } else if (categoria == 4 && sexo == 2 && idade < 30) {
                fullstackMulherMenor30++;
            }

            System.out.print("Deseja continuar (S/N)? ");
            continuar = leia.next().charAt(0);

        } while (Character.toUpperCase(continuar) == 'S');

        System.out.printf("Número de pessoas desenvolvedoras Backend:"+backend+ "\n");
        System.out.printf("Número de mulheres desenvolvedoras Frontend: "+frontendMulher+"\n");
        System.out.printf("Número de homens desenvolvedores Mobile maiores de 40 anos: "+mobileHomemMaior40+"\n");
        System.out.printf("Número de mulheres desenvolvedoras FullStack menores de 30 anos: "+fullstackMulherMenor30+"\n");


	}

}
