
public class Cliente {

	private String nome;
	private int cpf;
	private String endereco;

	public String getNome() {
		return nome;
	}

	public String getEndereco(){
		return endereco;
	}
	public int getCpf(){
		return cpf;
	}
	

	public Cliente(String nome, int cpf, String endereco) {
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
	}


	@java.lang.Override
	public java.lang.String toString() {
		return "Cliente{" +
				"nome='" + nome + '\'' +
				"cpf='" + cpf + '\'' +
				"endereco'"+endereco+'\''+
				'}';
	}

}
