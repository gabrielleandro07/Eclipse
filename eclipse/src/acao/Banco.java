package acao;

public class Banco {
	
	private String nomeBanco;
	private String cnpj;
	
	public Banco(String nomeBanco, String cnpj){
		setNomeBanco(nomeBanco);
		setCnpj(cnpj);
	}
	
	public String getNomeBanco() {
		return nomeBanco;
	}
	public void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public void imprimirInformacaoBanco(){
		System.out.println("Nome Do Banco: "+this.getNomeBanco()+" / Cnpj do Banco: "+ this.getCnpj());
	}
	
	
	

}
