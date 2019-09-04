package Exercicio6;

public class Trompete extends Metais {
	
	private String tipo;
	
	public Trompete(float preco,String material) {
		super(preco,material);
	}
	public Trompete(float preco,String material,String tipo) {
		super(preco,material);
		setTipo(tipo);
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		if(tipo == "salpinge" || tipo == "do tibete" || tipo == "suona" || tipo == "bucina" || tipo == "barroco"
				|| tipo == "em B ou Si Bemol" || tipo == "Mi Bemol" || tipo == "bastardo" || tipo == "de varas" 
				|| tipo == "picollo" || tipo == "bsixo" || tipo == "de bolso" || tipo == "de chaves")
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Trompete [tipo=");
		builder.append(tipo);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
}
