package desafio7;

class Retangulo extends FiguraGeometrica {
    double base;
    double altura;

    Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    double calcularArea() {
        return base * altura;
    }
}
