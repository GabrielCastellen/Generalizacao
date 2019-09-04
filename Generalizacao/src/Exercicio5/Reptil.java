package Exercicio5;

public class Reptil extends Animal {

	private String habitat;
	private String sexo;
	
	
	public Reptil(boolean temVida, String habitat, String sexo) {
		super(temVida);
		setHabitat(habitat);
		setSexo(sexo);
	}

	
	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Reptil [habitat=");
		builder.append(habitat);
		builder.append(", sexo=");
		builder.append(sexo);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
}
