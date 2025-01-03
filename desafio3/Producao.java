package desafio3;

public class Producao {
    static int previsaoDemanda = 200;
    static int producaoNormal = 250;
    static int estoquelnicial = 50;
    static int estoqueFinal;

    public static void main(String[] args){
        estoqueFinal = (estoquelnicial + producaoNormal) - previsaoDemanda;
        System.out.print("O estoque final previsto para o mês é de: " + estoqueFinal + " Unidades");
    }
}
