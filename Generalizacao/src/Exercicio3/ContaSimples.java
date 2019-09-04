package Exercicio3;

public class ContaSimples extends Conta {
	private double saldoPoupanca;
	public ContaSimples(String banco,int agencia,int numeroConta,double saldo,double saldoPoupanca) {
		super(banco,agencia,numeroConta,saldo);
		setSaldoPoupanca(saldoPoupanca);
	}
	
	public boolean depositoPoupanca(double valor) {
		if(valor > 0) {
			saldoPoupanca = saldoPoupanca + valor;
			return true;
		}
		else
			return false;
	}
	
	public boolean saquePoupanca(double valor) {
		if(saldoPoupanca >= valor) {
			saldoPoupanca = saldoPoupanca - valor;
			return true;
		}
		else
			return false;
	}
	
	public double getSaldoPoupanca() {
		return saldoPoupanca;
	}
	public void setSaldoPoupanca(double saldoPoupanca) {
		this.saldoPoupanca = saldoPoupanca;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaSimples [saldoPoupanca=");
		builder.append(saldoPoupanca);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
}
