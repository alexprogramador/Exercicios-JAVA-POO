package controledesafio2;

import modelodesafio2.Cliente;
import modelodesafio2.Veiculo;

public class Principal {
    public static void main(String [] args){
    Cliente cli = new Cliente();
    Veiculo vei = new Veiculo();
    
    cli.Cliente("000000000", "Jose", "Rua tal", "0xx-1111-1111", "jose@dominio.com");
    
    vei.Veiculo("RRR-0000", "Modelo tal", 1960, "fabricante tal", "Branco", cli);
    
    
    System.out.println("Cliente: " + vei.toString());
    
     }
}
