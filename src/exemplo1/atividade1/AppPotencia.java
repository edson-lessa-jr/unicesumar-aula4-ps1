package exemplo1.atividade1;

import java.util.Scanner;

public class AppPotencia {
    public static void main(String[] args) {
        double x, y;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe 1º número inteiro");
        x = (double) scanner.nextInt();
        System.out.println("Informe 2º número inteiro");
        y = (double) scanner.nextInt();

        double potencia = Math.pow(x, y);
        double raiz = Math.pow(x, (1 / y));
        double sqrt = Math.sqrt(x);
        System.out.println("A potência é: "+ potencia);
        System.out.println("A raíz é: "+ raiz);
        System.out.println("A raíz quadrada é: "+ sqrt);


    }
}
