public class Professor extends Pessoa {

	private double salario;
	private String nomeCurso;

	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getNomeCurso() {
		return nomeCurso
	}

	public double calcularSalarioLiquido() {
		return 0;
	}

	public String obterEtiquetaEndereco(){

	String s = "Endereço do Professor: ";
	s += super.getEndereco();

	return s;
    }
    @Override
    public void imprimirEtiquetaEndereco() {

    	system.out.println("imprimindo endereço do Professor");
    	system.out.println(this.obterEtiquetaEndereco());
    }

}
