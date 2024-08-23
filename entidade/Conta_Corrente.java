package entidade;

public class Conta_Corrente extends Conta {
	
	private double limite;

	public Conta_Corrente(String nome, int numero, double saldo, double limite) {  
		super(nome, numero, saldo);
		this.limite = limite;
	}
	
	@Override
	public String toString() {
		return "ContaCorrente" + mostrar() + "limite = " + limite + "\n";
				
	}
}