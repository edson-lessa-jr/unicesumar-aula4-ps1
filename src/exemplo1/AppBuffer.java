package exemplo1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class AppBuffer {
    public static void main(String[] args) {
        try {
            System.out.println("Informe o seu nome");
            InputStreamReader inputStreamReader = new InputStreamReader(System.in);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String nome = bufferedReader.readLine();
            System.out.println("Informe a sua idade");
            int idade = Integer.parseInt(bufferedReader.readLine());

            System.out.println("Nome: "+ nome);
            System.out.println("Idade: "+ idade);

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
