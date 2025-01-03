package desafio8;


import javax.swing.JOptionPane;

public class NotasAluno implements ConceitoAluno {
    public static void main(String[] args) {
        String notaString = JOptionPane.showInputDialog("Digite a nota do aluno (em formato decimal):");
        double nota = Double.parseDouble(notaString);

        String conceito;

        if (nota >= 7.0) {
            conceito = EXCELENTE;
        } else if (nota >= 5.0) {
            conceito = SATISFATORIO;
        } else {
            conceito = INSUFICIENTE;
        }

        JOptionPane.showMessageDialog(null, conceito);
    }
}
