public abstract class Pessoa {

	private String nome;
	private String endereco;
	private String telefone;
	private String cpf;

	private String telefoneCelular;

	public Pessoa() {
	public Pessoa(String nome, String endereco, String telefone);
	       super();
	       this.telefone = telefone;
	       this.nome = nome;
	       this.endereco = endereco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
	     this.nome = nome;	
	}
	public String getEndereço() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone(String telefone) {
		return telefone;
	}
	public String setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getTelefoneCelular() {
		return telefoneCelular;
	}
	public void setTelefoneCelular(String telefoneCelular) {
		this.telefoneCelular = telefoneCelular;
	}

	public abstract String obterEtiquetaEndereco();

	public abstract void imprimirEtiquetaEndereco();
}
