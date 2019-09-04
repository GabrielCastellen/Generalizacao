package Exercicio6;

public class Tuba extends Metais {
	
	private String tipo;
	
	public Tuba(float preco,String material) {
		super(preco,material);
	}
	public Tuba(float preco,String material,String tipo) {
		super(preco,material);
		setTipo(tipo);
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		if(tipo == "tuba de marcha" || tipo == "helicon" || tipo == "sousafone")
			this.tipo = tipo;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Tuba [tipo=");
		builder.append(tipo);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
		
}
