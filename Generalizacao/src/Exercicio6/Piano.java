package Exercicio6;

public class Piano extends Cordas {
	
	private String tipo;
	
	public Piano(float preco,int quantCordas) {
		super(preco,quantCordas);
	}
	public Piano(float preco,int quantCordas,String tipo) {
		super(preco,quantCordas);
		setTipo(tipo);
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		if(tipo == "de cauda" || tipo == "vertical" || tipo == "digital")
			this.tipo = tipo;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Piano [tipo=");
		builder.append(tipo);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

	
}
