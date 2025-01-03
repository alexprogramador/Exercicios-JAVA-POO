package desafio4;

import java.util.Scanner;

public class Viga {
    private double base;
    private double altura;
    private double comprimento;

    // Construtor
    public Viga(double base, double altura, double comprimento) {
        this.base = base;
        this.altura = altura;
        this.comprimento = comprimento;
    }

    // Método para calcular o volume da viga
    public double calcularVolume() {
        return base * altura * comprimento;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita os dados ao usuário via console
        System.out.println("Digite a base da viga (metros):");
        double base = scanner.nextDouble();

        System.out.println("Digite a altura da viga (metros):");
        double altura = scanner.nextDouble();

        System.out.println("Digite o comprimento da viga (metros):");
        double comprimento = scanner.nextDouble();

        // Cria uma instância da viga com os dados fornecidos
        Viga viga = new Viga(base, altura, comprimento);

        // Calcula e exibe o resultado
        double volume = viga.calcularVolume();
        System.out.println("O volume de concreto necessário é: " + volume + " metros cúbicos");

        scanner.close();
    }
}