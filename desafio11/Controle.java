package desafio11;

import java.util.Scanner;

public class Controle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando o preço de compra do usuário
        System.out.print("Digite o preço de compra do produto: ");
        double precoCompra = scanner.nextDouble();

        // Instanciando o produto com markup fornecido pelo cliente
        Produto produto = new Produto(1.54);

        // Calculando o preço de venda
        double precoVenda = produto.calcularPrecoVenda(precoCompra);

        // Exibindo o preço de venda
        System.out.println("Preço de venda do produto: " + precoVenda);

        scanner.close();
    }
}
