package Exercicio6;

public class Cordas extends InstrumentoMusical {
	
	private int quantCordas;
	
	public Cordas(float preco) {
		super(preco);
	}
	public Cordas(float preco,int quantCordas) {
		super(preco);
		setQuantCordas(quantCordas);
	}

	public int getQuantCordas() {
		return quantCordas;
	}

	public void setQuantCordas(int quantCordas) {
		if(quantCordas>=0)
			this.quantCordas = quantCordas;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cordas [quantCordas=");
		builder.append(quantCordas);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
