package acao;

public class Conta{

	private int numeroConta;
	private double saldo;
	private double limite;
	private Banco banco;
	private Cliente cliente;
	
	void imprimirInformacaoConta(){
		System.out.println("----------------------CONTA----------------------");
		System.out.println("Numero conta: " + this.numeroConta);
		System.out.println("Saldo conta: " + this.saldo);
		System.out.println("Limite conta: " + this.limite);
		System.out.println("----------------------Banco----------------------");
		banco.imprimirInformacaoBanco();
		System.out.println("----------------------DADOS----------------------");
		cliente.imprimeDados(cliente);
		System.out.println("----------------------CONTRATO----------------------");
		cliente.imprimeDataContrato();
	}
	
	void sacar(double valor){
		this.saldo -= valor;
	}
	void depositar(double valor){
		this.saldo += valor;
	}
	double mostrarSaldoTotalDisponivel(){
		return saldo + limite;
	}
	
	public Conta(int numeroConta, double limite){
		this.numeroConta = numeroConta;
		this.limite = limite;
	}
	
	boolean verificaSaldoTotalDisponivelPositivo(double saldo,double limite){
			
		double saldoDisp = saldo + limite;
		
		if(saldoDisp > 0){
			return true;
		} return false;
	}
	
	void transferir(Conta contaOrigem, Conta contaDestino, double valor){
		contaOrigem.sacar(valor);
		contaDestino.depositar(valor);
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
}
