
	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Scanner;

	public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        ArrayList<String> cores = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 5 cores:");

        for (int i = 0; i < 5; i++) {
            String cor = scanner.nextLine();
            cores.add(cor);
        }

        System.out.println("Listar todas as cores:");
        for (String cor : cores) {
            System.out.println(cor);
        }

        Collections.sort(cores);

        System.out.println("\nOrdenar as cores:");
        for (String cor : cores) {
            System.out.println(cor);
        }
        scanner.close();
    }
}
