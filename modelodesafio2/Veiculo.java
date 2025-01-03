package modelodesafio2;


public class Veiculo {
    private String placa;
    private String modelo;
    private int ano;
    private String fabricante;
    private String cor;
    private Cliente cliente;
    
    public void Veiculo(String placa,String modelo,int ano, String fabricante, String cor, Cliente cliente){
        this.ano = ano;
        this.cor = cor;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.placa = placa;
        this.cliente= cliente; 
    
    }
     public String toString(){
        return cliente+ " Veículo: " + "," + placa + "," + ano + "," + fabricante + "," + modelo + "," + cor;
    
    }
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
            
}
