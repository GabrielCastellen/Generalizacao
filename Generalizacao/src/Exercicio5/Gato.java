package Exercicio5;

public class Gato extends Mamifero {

	private String raca;
	private String corPelo;
	public Gato(boolean temVida, int glandulasMamarias,String sexo,String raca,String corPelo) {
		super(temVida,glandulasMamarias,sexo);
		this.raca = raca;
		this.corPelo = corPelo;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public String getCorPelo() {
		return corPelo;
	}
	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Gato [raca=");
		builder.append(raca);
		builder.append(", corPelo=");
		builder.append(corPelo);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
}
