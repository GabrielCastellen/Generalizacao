package Exercicio6;

public class Prato extends Percussao {

	private String tipo;
	
	public Prato(float preco,String metodoDeExecucao,String elementoProdutorDeSom) {
		super(preco,metodoDeExecucao,elementoProdutorDeSom);
	}
	public Prato(float preco,String metodoDeExecucao,String elementoProdutorDeSom,String tipo) {
		super(preco,metodoDeExecucao,elementoProdutorDeSom);
		setTipo(tipo);
	}
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		if(tipo == "orquestral" || tipo == "bateria")
			this.tipo = tipo;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Prato [tipo=");
		builder.append(tipo);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
}
