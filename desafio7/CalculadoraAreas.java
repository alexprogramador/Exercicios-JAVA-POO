package desafio7;


public class CalculadoraAreas {
    public static void main(String[] args) {
        // Exemplo de uso
        Retangulo retangulo = new Retangulo(5, 10);
        TrianguloRetangulo triangulo = new TrianguloRetangulo(3, 4);

        System.out.println("Área do retângulo: " + retangulo.calcularArea());
        System.out.println("Área do triângulo retângulo: " + triangulo.calcularArea());
    }
}