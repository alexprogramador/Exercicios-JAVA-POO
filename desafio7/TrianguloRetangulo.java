package desafio7;

class TrianguloRetangulo extends FiguraGeometrica {
    double base;
    double altura;

    TrianguloRetangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    double calcularArea() {
        return 0.5 * base * altura;
    }
}
