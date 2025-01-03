package desafio6;

public class Colaborador extends Pessoa {
    private String cargo;

    // Construtor
    public Colaborador(int id, String nome, String logradouro, String numero, String cep, String bairro, String cidade, String uf, String telefone, String cpfCnpj, String cargo) {
        super(id, nome, logradouro, numero, cep, bairro, cidade, uf, telefone, cpfCnpj);
        this.cargo = cargo;
    }

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

   
}

