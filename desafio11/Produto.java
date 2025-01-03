package desafio11;

//import java.util.Scanner;

//Classe que representa o produto
public class Produto {
 private final double markup; // Variável final

 public Produto(double markup) {
     this.markup = markup;
 }

 // Método final para calcular o preço de venda do produto
 public final double calcularPrecoVenda(double precoCompra) {
     return markup * precoCompra;
 }
}

