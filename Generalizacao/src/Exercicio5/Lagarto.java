package Exercicio5;

public class Lagarto extends Reptil {
	
	private String especie;
	private float comprimento;
	
	public Lagarto(boolean temVida, String habitat, String sexo) {
		super(temVida,habitat,sexo);
	}
	public Lagarto(boolean temVida, String habitat, String sexo,String especie,float comprimento) {
		super(temVida,habitat,sexo);
		setEspecie(especie);
		setComprimento(comprimento);
	}
	
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public float getComprimento() {
		return comprimento;
	}
	public void setComprimento(float comprimento) {
		this.comprimento = comprimento;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Lagarto [especie=");
		builder.append(especie);
		builder.append(", comprimento=");
		builder.append(comprimento);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	

}
