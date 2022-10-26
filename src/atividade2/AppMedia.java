package atividade2;

import java.util.Scanner;

public class AppMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o 1º número");
        double n1 = scanner.nextDouble();
        System.out.println("Informe o 2º número");
        double n2 = scanner.nextDouble();
        System.out.println("Informe o 3º número");
        double n3 = scanner.nextDouble();
        System.out.printf("A média é %.2f",(n1+n2+n3)/3);
    }
}
