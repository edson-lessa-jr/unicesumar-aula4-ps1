package exemplo2;

import java.util.Scanner;

public class AppScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o seu nome");
        String nome = scanner.nextLine();
        System.out.println("Informe o sua idade");
        int idade = scanner.nextInt();

        System.out.println("Nome: "+ nome);
        System.out.println("Idade: "+ idade);
    }
}
