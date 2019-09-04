package Exercicio5;

public class Mamifero extends Animal {
	private int glandulasMamarias ;
	private String sexo;
	
	public Mamifero(boolean temVida, int glandulasMamarias,String sexo) {
		super(temVida);
		this.glandulasMamarias = glandulasMamarias;
		this.sexo = sexo;
	}
	

	public int getGlandulasMamarias() {
		return glandulasMamarias;
	}

	public void setGlandulasMamarias(int glandulasMamarias) {
		this.glandulasMamarias = glandulasMamarias;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Mamifero [glandulasMamarias=");
		builder.append(glandulasMamarias);
		builder.append(", sexo=");
		builder.append(sexo);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
