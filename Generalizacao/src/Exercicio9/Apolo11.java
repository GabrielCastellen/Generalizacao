package Exercicio9;

public class Apolo11 extends NaveEspacial {
	
	private String tipocombustivel;
	
	public Apolo11(double velocidadeMaxima) {
		super(velocidadeMaxima);
	}
	public Apolo11(double velocidadeMaxima,String tipocombustivel) {
		super(velocidadeMaxima);
		setTipocombustivel(tipocombustivel);
	}

	public String getTipocombustivel() {
		return tipocombustivel;
	}

	public void setTipocombustivel(String tipocombustivel) {
		this.tipocombustivel = tipocombustivel;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Apolo11 [tipocombustivel=");
		builder.append(tipocombustivel);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	

}
