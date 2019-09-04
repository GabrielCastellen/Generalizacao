package Exercicio9;

public class MillenniumFalcon extends Apolo11 {
	
	private float classeHiperPropulsor;
	
	public MillenniumFalcon(double velocidadeMaxima,String tipocombustivel) {
		super(velocidadeMaxima,tipocombustivel);
	}
	public MillenniumFalcon(double velocidadeMaxima,String tipocombustivel,float classeHiperPropulsor) {
		super(velocidadeMaxima,tipocombustivel);
		setClasseHiperPropulsor(classeHiperPropulsor);
	}

	public float getClasseHiperPropulsor() {
		return classeHiperPropulsor;
	}

	public void setClasseHiperPropulsor(float classeHiperPropulsor) {
		this.classeHiperPropulsor = classeHiperPropulsor;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MillenniumFalcon [classeHiperPropulsor=");
		builder.append(classeHiperPropulsor);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	

}
