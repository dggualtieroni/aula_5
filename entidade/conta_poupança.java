package entidade;

public class conta_poupança extends Conta  {

	public conta_poupança(String nome, int numero, double saldo) {
		super(nome, numero, saldo);
		
		
	}
	@Override
	public String toString() {
		return "Conta_poupança " + mostrar();
	}

		

	}


