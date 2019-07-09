package acao;

public class Atendente extends Pessoa {

	private String matricula;
	
	void imprimeAtendente(){
		System.out.println("Matricula Atendente: " + this.matricula);
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

}
