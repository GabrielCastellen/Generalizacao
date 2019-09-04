package Exercicio5;

public class Cao extends Mamifero {

	private String raca;
	private String porte;
	
	public Cao(boolean temVida,int glandulasMamarias,String sexo) {
		super(temVida,glandulasMamarias,sexo);
	}
	public Cao(boolean temVida,int glandulasMamarias,String sexo,String raca,String porte) {
		super(temVida,glandulasMamarias,sexo);
		setRaca(raca);
		setPorte(porte);
	}
	
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public String getPorte() {
		return porte;
	}
	public void setPorte(String porte) {
		this.porte = porte;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cao [raca=");
		builder.append(raca);
		builder.append(", porte=");
		builder.append(porte);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
