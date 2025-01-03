package desafio12;

import javax.swing.JOptionPane;

//Classe externa que representa a calculadora
public class Calculadora {
 
 // Classe aninhada não estática para a operação de soma
 class Soma {
     public double calcular(double num1, double num2) {
         return num1 + num2;
     }
 }
 
 // Classe aninhada não estática para a operação de subtração
 class Subtracao {
     public double calcular(double num1, double num2) {
         return num1 - num2;
     }
 }
 
 // Classe aninhada não estática para a operação de multiplicação
 class Multiplicacao {
     public double calcular(double num1, double num2) {
         return num1 * num2;
     }
 }
 
 // Classe aninhada não estática para a operação de divisão
 class Divisao {
     public double calcular(double num1, double num2) {
         if (num2 != 0) {
             return num1 / num2;
         } else {
             JOptionPane.showMessageDialog(null, "Erro: divisão por zero!");
             return Double.NaN; // Retorna NaN (Not a Number) em caso de divisão por zero
         }
     }
 }
 
 // Método para realizar uma operação específica com os dois números fornecidos
 public double realizarOperacao(double num1, double num2, String operacao) {
     double resultado = Double.NaN; // Valor padrão para caso a operação não seja reconhecida
     
     switch (operacao) {
         case "+":
             resultado = new Soma().calcular(num1, num2);
             break;
         case "-":
             resultado = new Subtracao().calcular(num1, num2);
             break;
         case "*":
             resultado = new Multiplicacao().calcular(num1, num2);
             break;
         case "/":
             resultado = new Divisao().calcular(num1, num2);
             break;
         default:
             JOptionPane.showMessageDialog(null, "Operação inválida!");
     }
     
     return resultado;
 }
 
 // Método para entrada de dados e chamada da operação
 public void executar() {
     String inputNum1 = JOptionPane.showInputDialog("Digite o primeiro número:");
     double num1 = Double.parseDouble(inputNum1);
     
     String inputNum2 = JOptionPane.showInputDialog("Digite o segundo número:");
     double num2 = Double.parseDouble(inputNum2);
     
     String operacao = JOptionPane.showInputDialog("Digite a operação (+, -, *, /):");
     
     double resultado = realizarOperacao(num1, num2, operacao);
     if (!Double.isNaN(resultado)) {
         JOptionPane.showMessageDialog(null, "Resultado da operação: " + resultado);
     }
 }
 
 // Método main para testar a calculadora
 public static void main(String[] args) {
     Calculadora calculadora = new Calculadora();
     calculadora.executar();
 }
}
