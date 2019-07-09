package acao;

public class TestaConta {

	public static void main(String[] args) {
			
		Atendente atendente = new Atendente();
			atendente.setCpf("018.854.548-98");
			atendente.setMatricula("275043");
			atendente.setNome("Gabriel");
			System.out.println("----------------------Atendente---------------------- ");
			atendente.imprimeAtendente();
			atendente.imprimeDados(atendente);
		
		Cliente cliente = new Cliente();
			cliente.setCpf("012.548.957-14");
			cliente.setDataContratacao("19/07/2018");
			cliente.setNome("Pedro");
			System.out.println("----------------------Data do Contrato----------------------");
			cliente.imprimeDataContrato();
			cliente.imprimeDados(cliente);
		
		Banco banco = new Banco("Banco Inter", "98.125.658/0001-25");
			banco.setCnpj("98.125.658/0001-25");
			banco.setNomeBanco("Banco Inter");
			banco.imprimirInformacaoBanco();
		
		Conta conta = new Conta(2365,300);
			conta.setBanco(banco);
			conta.setCliente(cliente);
			conta.depositar(700);
			conta.sacar(100);
			
		Conta conta2 = new Conta(3256,0);
			conta2.setBanco(banco);
			conta2.setCliente(cliente);
			conta.sacar(conta.getSaldo()); 
			
		double valor = 100;
		if(conta2.mostrarSaldoTotalDisponivel() >= 100){
			conta.transferir(conta2, conta, valor);
			System.out.println("Transferencia realizada");
		}else{
			System.out.println("                                                    ");
			System.out.println("                                                    ");
			System.out.println("Não existe saldo para transferência");
		}
		conta.imprimirInformacaoConta();	
		
	}

}
