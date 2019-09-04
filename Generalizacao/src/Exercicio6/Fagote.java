package Exercicio6;

public class Fagote extends Madeiras {
	
	private String sistema;
	
	public Fagote(float preco,String material) {
		super(preco,material);
	}
	public Fagote(float preco,String material,String sistema) {
		super(preco,material);
		setSistema(sistema);
	}

	public String getSistema() {
		return sistema;
	}

	public void setSistema(String sistema) {
		if(sistema == "Heckel" || sistema == "Buffet")
			this.sistema = sistema;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Fagote [sistema=");
		builder.append(sistema);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

	
	
}
