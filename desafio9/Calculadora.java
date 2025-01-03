package desafio9;

public class Calculadora {
    public static void main(String[] args) {
        double num1 = 10;
        double num2 = 5;

        Operacao soma = new Soma();
        Operacao subtracao = new Subtracao();
        Operacao multiplicacao = new Multiplicacao();
        Operacao divisao = new Divisao();

        System.out.println("Soma: " + soma.calcular(num1, num2));
        System.out.println("Subtração: " + subtracao.calcular(num1, num2));
        System.out.println("Multiplicação: " + multiplicacao.calcular(num1, num2));
        System.out.println("Divisão: " + divisao.calcular(num1, num2));
    }
}
