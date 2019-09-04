package Exercicio6;

public class InstrumentoMusical {
	
	private float preco;
	
	public InstrumentoMusical() {
		
	}
	
	public InstrumentoMusical(float preco) {
		setPreco(preco);
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("InstrumentoMusical [preco=");
		builder.append(preco);
		builder.append("]");
		return builder.toString();
	}

	
}
