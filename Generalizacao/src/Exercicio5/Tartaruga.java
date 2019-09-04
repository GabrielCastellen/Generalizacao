package Exercicio5;

public class Tartaruga extends Reptil {
	
	private String corCasco;
	private String especie;
	
	public Tartaruga(boolean temVida, String habitat, String sexo) {
		super(temVida,habitat,sexo);
	}
	
	public Tartaruga(boolean temVida, String habitat, String sexo,String corCasco,String especie) {
		super(temVida,habitat,sexo);
		setCorCasco(corCasco);
		setEspecie(especie);
	}

	public String getCorCasco() {
		return corCasco;
	}

	public void setCorCasco(String corCasco) {
		this.corCasco = corCasco;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Tartaruga [corCasco=");
		builder.append(corCasco);
		builder.append(", especie=");
		builder.append(especie);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
