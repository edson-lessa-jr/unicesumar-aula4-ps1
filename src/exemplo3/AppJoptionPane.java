package exemplo3;

import javax.swing.*;

public class AppJoptionPane {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog(null,"Informe o nome",
                "Entrada de nome", JOptionPane.QUESTION_MESSAGE);

        int idade = Integer.parseInt(JOptionPane.showInputDialog("Informar a idade"));
        JOptionPane.showMessageDialog(null,"Nome: "+nome+"\nIdade: "+idade,
                "Resposta do nome",JOptionPane.WARNING_MESSAGE);
//        JOptionPane.showMessageDialog(null,);
    }
}
