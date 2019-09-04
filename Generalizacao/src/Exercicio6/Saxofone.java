package Exercicio6;

public class Saxofone extends Madeiras {
	
	private String tipo;
	
	public Saxofone(float preco,String material) {
		super(preco,material);
	}
	public Saxofone(float preco,String material,String tipo) {
		super(preco,material);
		setTipo(tipo);
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		if(tipo == "sopranino" || tipo == "soprano" || tipo == "alto" || tipo == "tenor" || tipo == "barítono"
				|| tipo == "baixo" || tipo == "contrabaixo" || tipo == "sopraníssimo" || tipo == "soprano em C"
				|| tipo == "soprano semi-curvo" || tipo == "mezzo soprano" || tipo == "C melody" || tipo == "barítono em F"
				|| tipo == "contralto" || tipo == "baixo em C" || tipo == "contrabaixo" )
			this.tipo = tipo;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Saxofone [tipo=");
		builder.append(tipo);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
